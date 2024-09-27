@Controller
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/booking/confirm")
    public String confirmBooking(@RequestParam Integer scheduleId, @RequestParam Integer seatId, @RequestParam Integer userId) {
        bookingService.bookSeat(scheduleId, seatId, userId);
        return "redirect:/bookings";
    }

    @GetMapping("/bookings")
    public String getBookings(Model model, @RequestParam Integer userId) {
        model.addAttribute("bookings", bookingService.getBookingsByUserId(userId));
        return "bookings/list";
    }
}
