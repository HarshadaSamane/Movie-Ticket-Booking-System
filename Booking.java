public class Booking {
    private String movieName;
    private String userName;
    private int seatsBooked;

    public Booking(String movieName, String userName, int seatsBooked) {
        this.movieName = movieName;
        this.userName = userName;
        this.seatsBooked = seatsBooked;
    }

    public void displayBooking() {
        System.out.println("User: " + userName);
        System.out.println("Movie: " + movieName);
        System.out.println("Seats Booked: " + seatsBooked);
        System.out.println();
    }
}
