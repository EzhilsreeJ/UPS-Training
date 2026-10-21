
import java.time.*;

public class TimeDurationCalculator {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.now();
        LocalTime t2 = t1.plusHours(2);

        Duration d = Duration.between(t1, t2);

        System.out.println(d.toHours());
    }
}
