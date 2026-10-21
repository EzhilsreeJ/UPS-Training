import java.time.*;
import java.time.format.*;

public class Formatter {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        String result = now.format(format);

        System.out.println(result);
    }
}
