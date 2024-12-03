import java.util.ArrayList;
import java.util.Scanner;

public class TicketBookingSystem {
    private static ArrayList<Movie> movies = new ArrayList<>();
    private static ArrayList<Booking> bookings = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialising movies
        movies.add(new Movie("Inception", "Sci-Fi", 50));
        movies.add(new Movie("The Dark Knight", "Action", 30));
        movies.add(new Movie("Frozen", "Animation", 20));

        System.out.println("Welcome to Movie Ticket Booking System!");
        int choice;

        do {
            System.out.println("\n1. View Movies");
            System.out.println("2. Book Tickets");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayMovies();
                    break;
                case 2:
                    bookTickets(scanner);
                    break;
                case 3:
                    displayBookings();
                    break;
                case 4:
                    System.out.println("Thank you for using the Movie Ticket Booking System!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void displayMovies() {
        System.out.println("\nAvailable Movies:");
        for (Movie movie : movies) {
            movie.displayInfo();
        }
    }

    private static void bookTickets(Scanner scanner) {
        System.out.print("\nEnter your name: ");
        String userName = scanner.next();

        System.out.println("\nAvailable Movies:");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println((i + 1) + ". " + movies.get(i).getName());
        }

        System.out.print("Choose a movie (1-" + movies.size() + "): ");
        int movieChoice = scanner.nextInt();

        if (movieChoice < 1 || movieChoice > movies.size()) {
            System.out.println("Invalid choice! Returning to main menu.");
            return;
        }

        Movie selectedMovie = movies.get(movieChoice - 1);

        System.out.print("Enter number of seats to book: ");
        int seats = scanner.nextInt();

        if (selectedMovie.bookSeats(seats)) {
            System.out.println("Booking successful!");
            bookings.add(new Booking(selectedMovie.getName(), userName, seats));
        } else {
            System.out.println("Not enough seats available!");
        }
    }

    private static void displayBookings() {
        if (bookings.isEmpty()) {
            System.out.println("\nNo bookings yet.");
        } else {
            System.out.println("\nYour Bookings:");
            for (Booking booking : bookings) {
                booking.displayBooking();
            }
        }
    }
}
