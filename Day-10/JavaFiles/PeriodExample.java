
import java.time.*;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2020, 1, 1);
        LocalDate d2 = LocalDate.now();

        Period p = Period.between(d1, d2);

        System.out.println("Years: " + p.getYears());
        System.out.println("Months: " + p.getMonths());
        System.out.println("Days: " + p.getDays());
    }
}
