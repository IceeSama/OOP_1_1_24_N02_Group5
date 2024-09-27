public interface BookingService {
    void bookSeat(Integer scheduleId, Integer seatId, Integer userId);
    List<Booking> getBookingsByUserId(Integer userId);
}
@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private SeatRepository seatRepository;

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void bookSeat(Integer scheduleId, Integer seatId, Integer userId) {
        // Kiểm tra xem ghế đã được đặt chưa
        Seat seat = seatRepository.findById(seatId)
            .orElseThrow(() -> new ResourceNotFoundException("Seat not found"));
        if (seat.isBooked()) {
            throw new IllegalStateException("Seat has already been booked.");
        }

        // Lấy thông tin lịch chiếu
        Schedule schedule = scheduleRepository.findById(scheduleId)
            .orElseThrow(() -> new ResourceNotFoundException("Schedule not found"));

        // Lấy thông tin người dùng
        User user = userRepository.findById(userId)
            .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        // Tạo đối tượng Booking và lưu vào database
        Booking booking = new Booking();
        booking.setUser(user);
        booking.setSchedule(schedule);
        booking.setSeat(seat);
        booking.setPrice(schedule.getPrice());
        booking.setSeatStatus(1); // Đánh dấu ghế đã được đặt

        bookingRepository.save(booking);

        // Đánh dấu ghế đã được đặt
        seat.setBooked(true);
        seatRepository.save(seat);
    }

    @Override
    public List<Booking> getBookingsByUserId(Integer userId) {
        return bookingRepository.findByUserId(userId);
    }
}
