
import java.time.*;

public class today {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println(today);
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.plusDays(5));
        System.out.println(today.minusMonths(1));
    }
}
