import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original=num;
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        System.out.println("Length of  "+original+" is "+count);
        sc.close();
    }
}
