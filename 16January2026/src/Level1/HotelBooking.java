package Level1;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking() {
        System.out.println("Default Constructor");
    }

    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static  void  main(String args[]){
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("Rahul", "Luxury", 3);
        HotelBooking booking3 = new HotelBooking(booking2);
//        booking1.display();
        booking2.display();
        booking3.display();
    }
}
