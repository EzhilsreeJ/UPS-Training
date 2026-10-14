import java.util.*;
interface Payment{
    void pay();
}
class Upi implements Payment{
    public void pay(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please UPI pin: ");
        int pin=PaymentMethod.sc.nextInt();
        String s = pin + "";

        if (s.length() == 4 && pin == 1234) {
            System.out.println("Payment successful Through UPI");
        } else {
            System.out.println("Payment Failed.Please enter valid 4 digit pin");
        }
    }
}
class Cash implements Payment{
    public void pay(){
    System.out.println("Payment successful Through Cash");
    }
    
}
class Card implements Payment{
    public void pay(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please pin: ");
        int pin=sc.nextInt();
        String s = pin + "";

        if (s.length() == 4 && pin == 1234) {
            System.out.println("Payment successful Through UPI");
        } else {
            System.out.println("Please enter valid 4 digit pin");
        }
    }
}

public class PaymentMethod {
    public static void main(String[] args) {
        Payment p;
        System.out.println("1. UPI \n2. Cash \n3. Card \nPlease Select payment method");
        int n=sc.nextInt();
        switch (n) {
            case 1:
                p= new Upi();
                p.pay();
                break;
        
            case 2:
                p = new Cash();
                p.pay();
                break;
            case 3:
                p = new Card();
                p.pay();
                break;
            default:
                System.out.println("Invalid choice");
        }
        
        }    
}