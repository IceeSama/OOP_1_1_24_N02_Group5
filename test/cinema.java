@Entity
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cinemaId;

    private String cinemaName;
    private String cinemaAddress;

    // Getters and setters
}
