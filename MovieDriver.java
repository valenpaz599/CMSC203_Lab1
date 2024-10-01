package lab1;

import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Movie movie = new Movie();

        // ask user to enter the title of the movie
        System.out.print("Enter the title of the movie: ");
        // Read the input for the movie title
        String title = scanner.nextLine();
        // Set the movie's title 
        movie.setTitle(title);

        // ASk the user to enter the movie's rating
        System.out.print("Enter the movie's rating: ");
        // Read the user's input for the rating
        String rating = scanner.nextLine();
        // Set the movie's rating 
        movie.setRating(rating);

        // Ask the user to enter the number of tickets sold
        System.out.print("Enter the number of tickets sold: ");
        // Read the input for the number of tickets sold
        int ticketsSold = scanner.nextInt();
        // Set the movie's tickets sold using the setter method
        movie.setSoldTickets(ticketsSold);

        // Print out the movie information 
        System.out.println("\nMovie Information:");
        System.out.println(movie.toString());

        
        scanner.close();
    }
}
