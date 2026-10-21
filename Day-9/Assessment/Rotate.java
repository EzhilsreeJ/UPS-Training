
import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        k %= a.length;

        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++)
            b[(i + k) % a.length] = a[i];

        System.out.println(Arrays.toString(b));
    }
}
