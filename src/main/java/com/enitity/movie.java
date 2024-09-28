@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    private String movieName;
    private String movieDescription;
    private String movieTrailer;
    private String movieCens;
    private String movieGenres;
    private LocalDate movieRelease;
    private LocalTime movieLength;
    private String movieFormat;
    private String moviePoster;

    // Getters and setters
}