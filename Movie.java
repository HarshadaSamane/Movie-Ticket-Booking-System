public class Movie {
    private String name;
    private String genre;
    private int availableSeats;

    public Movie(String name, String genre, int availableSeats) {
        this.name = name;
        this.genre = genre;
        this.availableSeats = availableSeats;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public boolean bookSeats(int numberOfSeats) {
        if (numberOfSeats <= availableSeats) {
            availableSeats -= numberOfSeats;
            return true;
        }
        return false;
    }

    public void displayInfo() {
        System.out.println("Movie: " + name);
        System.out.println("Genre: " + genre);
        System.out.println("Available Seats: " + availableSeats);
        System.out.println();
    }
}
