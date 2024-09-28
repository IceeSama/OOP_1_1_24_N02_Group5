@Controller
public class BookingController {
    @Autowired
    private ScheduleService scheduleService;
    
    @Autowired
    private SeatService seatService;

    @GetMapping("/booking/{scheduleId}")
    public String bookingPage(@PathVariable("scheduleId") Integer scheduleId, Model model) {
        Schedule schedule = scheduleService.getScheduleById(scheduleId);
        model.addAttribute("schedule", schedule);
        model.addAttribute("seats", seatService.getSeatsByRoom(schedule.getRoom()));
        return "booking";
    }

    @PostMapping("/booking/confirm")
    public String confirmBooking(@RequestParam Integer scheduleId, @RequestParam Integer seatId) {
        // Xử lý logic đặt vé
        // ...
        return "redirect:/";
    }
}