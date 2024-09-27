@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String username;
    private String password;
    private String avatar;
    private String fullname;
    private LocalDate birthday;
    private Integer gender;
    private String email;
    private String city;
    private String phone;
    private Integer point;

    // Getters and setters
}
