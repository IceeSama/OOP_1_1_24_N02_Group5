@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String username;
    private String password;
    private String avatar;
    private String fullname;
    private Date birthday;
    private int gender;
    private String email;
    private String city;
    private String phone;
    private int point;

    // Getters and setters
}
