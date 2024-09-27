@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public String getMovies(Model model) {
        model.addAttribute("movies", movieService.getAllMovies());
        return "movies/index";
    }

    @GetMapping("/movie/{id}")
    public String getMovieDetail(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("movie", movieService.getMovieById(id));
        return "movies/detail";
    }
}
