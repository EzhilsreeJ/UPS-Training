package Code;
import java.util.*;

class Movie {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to EVP Cinemas");
        while(true){
        System.out.println("Today Movie List");  
        System.out.println("1. Retro");
        System.out.println("2. Jailer");
        System.out.println("3. Dragon");
        System.out.println("4. GOAT");
        System.out.println("Select a movie (1-4):");
        int movie = sc.nextInt();

        String movieName = "";
        String screen = "";
        
        switch (movie) {
            case 1:
                movieName = "Retro";
                screen = "Screen 1";
                break;

            case 2:
                movieName = "Jailer";
                screen = "Screen 2";
                break;

            case 3:
                movieName = "Dragon";
                screen = "Screen 3";
                break;

            case 4:
                movieName = "GOAT";
                screen = "Screen 4";
                break;

            default:
                System.out.println("Invalid movie selection!");
                return;
        }

        System.out.println("\nBooking Details");
        System.out.println("Movie: " + movieName);
        System.out.println("Screen: " + screen);

        System.out.println("Avaiable Seats");
        System.out.println("1. With A/c - Rs.350");
        System.out.println("2. Without A/c - Rs.200");
        System.out.println("Please select type of seat:");
        int seat = sc.nextInt();

        if (seat == 1) {
            System.out.println("Seat Type: With A/c");
            System.out.println("Movie Cost: Rs.350");
            System.out.println("Movie booked successfully!");
        } 
        else if (seat == 2) {
            System.out.println("Seat Type: Without A/c");
            System.out.println("Movie Cost: Rs.200");
            System.out.println("Movie booked successfully!");
        } 
        else {
            System.out.println("Invalid seat selection!");
        }
    }
    
}
}