@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    private String movieName;
    private String movieDescription;
    private String movieTrailer;
    private String movieCens;
    private String movieGenres;
    private Date movieRelease;
    private Time movieLength;
    private String movieFormat;
    private String moviePoster;

    // Getters and setters
}
