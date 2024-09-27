public interface MovieService {
    List<Movie> getAllMovies();
    Movie getMovieById(Integer id);
}

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(Integer id) {
        return movieRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Movie not found with id " + id));
    }
}
