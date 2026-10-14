public class ReverseString {
    public static void main(String[] args) {
        // String s="Java Full Stack";
        // for(int i=s.length()-1;i>=0;i--){
        //     System.out.print(s.charAt(i));
        // }
        String s = "Java Full Stack";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        for (String word : rev.split(" ")) {
            System.out.print(word + " ");
        }
    }
}