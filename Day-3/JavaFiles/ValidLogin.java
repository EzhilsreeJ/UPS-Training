class ValidLogin{
    public static void main(String [] args){
        String username="Ezhil";
        String password="12345";
        if(username.equals("Ezhil")){
            System.out.println("Valid User");
            if(password.equals("12345")){
                System.out.println("Welcome "+username);
            }
            else{
                System.out.println("Please Enter Valid password");
            }
        }
        else System.out.println("Please Enter valid username");
    }
}