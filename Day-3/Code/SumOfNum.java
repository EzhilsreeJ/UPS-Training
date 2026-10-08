import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        // System.out.println(n*(n+1)/2);
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Total sum is "+sum);
    }
    
}
