
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "Dormitory".replaceAll("\\s+", "").toLowerCase();
        String s2 = "Dirty room".replaceAll("\\s+", "").toLowerCase();

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b) ? "The strings are anagrams." : "Not anagrams.");
    }
}
