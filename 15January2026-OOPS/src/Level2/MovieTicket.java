package Level2;

public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(int seat, double cost) {
        seatNumber = seat;
        price = cost;
    }

    void displayDetails() {
        System.out.println(movieName);
        System.out.println(seatNumber);
        System.out.println(price);
    }

    public static void main(String[] args) {
        MovieTicket m = new MovieTicket();
        m.movieName = "Inception";
        m.bookTicket(25, 250);
        m.displayDetails();
    }
}

