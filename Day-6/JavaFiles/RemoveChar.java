public class RemoveChar {
    public static void main(String[] args) {
        String s="Java Full Stack";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                System.out.print(s.charAt(i));
            }
        }
    }
    
}