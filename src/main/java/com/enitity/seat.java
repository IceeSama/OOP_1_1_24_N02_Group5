@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seatId;

    private String seatType;
    private String row;
    private String number;
    private boolean isBooked;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    // Getters and setters
}