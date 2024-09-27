@Entity
@Table(name = "seats")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seatId;

    private Integer seatType;
    private String row;
    private Integer number;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    // Getters and setters
}
