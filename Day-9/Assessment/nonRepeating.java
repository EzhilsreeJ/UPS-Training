
public class nonRepeating {
    public static void main(String[] args) {
        String s = "swiss";

        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            for (int j = 0; j < s.length(); j++)
                if (s.charAt(i) == s.charAt(j))
                    count++;

            if (count == 1) {
                System.out.println("First non-repeating character: " + s.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}
