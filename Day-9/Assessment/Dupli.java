
public class Dupli {
    public static void main(String[] args) {
        int[] a = {4, 2, 7, 4, 8, 2, 9, 4};

        System.out.print("Duplicate elements: ");

        for (int i = 0; i < a.length; i++) {
            boolean found = false;

            for (int j = 0; j < i; j++)
                if (a[i] == a[j])
                    found = true;

            if (!found) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        System.out.print(a[i] + " ");
                        break;
                    }
                }
            }
        }

        System.out.println();
    }
}

