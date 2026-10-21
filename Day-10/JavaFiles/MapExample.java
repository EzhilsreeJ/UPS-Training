
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Aasrith");
        map.put(2, "Rohith");
        map.put(3, "Rohan");
        map.put(2, "Akash");

        System.out.println(map);
        System.out.println("Value: " + map.get(2));
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());
    }
}
