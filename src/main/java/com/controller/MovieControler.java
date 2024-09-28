public @Controller
public class MovieController {
    @Autowired
    private MovieService movieService;
    
    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/")
    public String viewMovies(Model model) {
        model.addAttribute("movies", movieService.getAllMovies());
        return "index";
    }

    @GetMapping("/movie/{id}")
    public String viewMovieDetail(@PathVariable("id") Integer id, Model model) {
        Movie movie = movieService.getMovieById(id);
        model.addAttribute("movie", movie);
        model.addAttribute("schedules", scheduleService.getSchedulesByMovieId(id));
        return "movie-detail";
    }
} MovieControler {
    
}
    