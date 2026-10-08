package Code;
import java.util.*;
class OddEven{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        if(start%2!=0){
            start+=1;
        }
        while(start<=end){
        if(start%2==0){
            System.out.println(start);
            start+=2;
        }
      }
    }
}