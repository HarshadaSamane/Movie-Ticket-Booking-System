# Movie Ticket Booking System

## Overview

The **Movie Ticket Booking System** is a Java-based application that allows users to:
- View a list of available movies.
- Book tickets for a selected movie.
- View all booking details made by users.

This project demonstrates basic object-oriented programming (OOP) concepts such as classes, methods, and user input handling in Java. It also provides a simple console interface for interaction.

## Features

- **View Movies**: Displays a list of movies with available seats.
- **Book Tickets**: Users can book tickets by selecting a movie and entering the number of seats.
- **View Bookings**: Displays all bookings made by users, including movie name and the number of tickets booked.
- **Simple Console Interface**: A user-friendly, text-based interface for easy navigation and interaction.

## Files Structure

The project is divided into multiple Java files:

1. **Movie.java**: Defines the properties and behavior of a movie, such as name, genre, and available seats.
2. **Booking.java**: Handles user bookings, storing the movie name, user name, and the number of tickets booked.
3. **TicketBookingSystem.java**: Main class that runs the system and handles user input/output, as well as interactions with movies and bookings.

## How to Run

### Step 1: Download/Clone the Project

Clone or download the project files to your local machine.

### Step 2: Compile the Files

Open a terminal in the project directory and compile all the Java files with the following command:

```bash
javac *.java
```
### Step 3: Run the System

After successful compilation, run the **TicketBookingSystem** class using the command:

```bash
java TicketBookingSystem
```
## How to Use

### 1. View Movies

When you run the system, you can choose the **View Movies** option to display a list of available movies, including their name, genre, and the number of available seats.

### 2. Book Tickets

To book tickets:
- Enter your name.
- Choose a movie by number from the displayed list.
- Enter the number of seats you want to book.
- The system will check if the requested number of seats is available and confirm the booking.

### 3. View Bookings

To view your bookings, select the **View Bookings** option. This will display all the bookings made, showing the user’s name, movie name, and the number of seats booked.

### 4. Exit

To exit the system, simply select the **Exit** option. The program will terminate.
## Sample Output

```bash
Welcome to Movie Ticket Booking System!
------------------------
1. View Movies
2. Book Tickets
3. View Bookings
4. Exit
Enter your choice: 1

Available Movies:
Movie: Inception
Genre: Sci-Fi
Available Seats: 50

Movie: The Dark Knight
Genre: Action
Available Seats: 30

Movie: Frozen
Genre: Animation
Available Seats: 20

------------------------
1. View Movies
2. Book Tickets
3. View Bookings
4. Exit
Enter your choice: 2

Enter your name: John
Available Movies:
1. Inception
2. The Dark Knight
3. Frozen
Choose a movie (1-3): 1
Enter number of seats to book: 3
Booking successful!
------------------------
1. View Movies
2. Book Tickets
3. View Bookings
4. Exit
Enter your choice: 3

Your Bookings:
User: John
Movie: Inception
Seats Booked: 3
```
## Requirements

- **Java 8 or higher**: This project uses basic Java features available in version 8 or higher.
- **Operating System**: The program runs on any OS with Java installed (Windows, Mac, Linux).

## Future Enhancements

- **Database Integration**: For permanent storage of movie and booking details.
- **Graphical User Interface (GUI)**: A GUI can be added for a more user-friendly experience.
- **Payment System**: Implement a mock payment gateway for ticket purchase.

## Contribution

If you'd like to contribute to this project, feel free to fork it, make changes, and create a pull request with your improvements.

## License

This project is open-source and free to use. Feel free to modify and distribute it as per your needs.
