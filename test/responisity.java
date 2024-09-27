public interface UserRepository extends JpaRepository<User, Integer> {}
public interface MovieRepository extends JpaRepository<Movie, Integer> {}
public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {}
public interface BookingRepository extends JpaRepository<Booking, Integer> {}
public interface SeatRepository extends JpaRepository<Seat, Integer> {}
public interface RoomRepository extends JpaRepository<Room, Integer> {}
public interface CinemaRepository extends JpaRepository<Cinema, Integer> {}
