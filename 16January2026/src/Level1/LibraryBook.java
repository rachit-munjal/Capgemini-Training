package Level1;

public class LibraryBook {
    String title;
    String author;
    int price;
    boolean available;

    LibraryBook(){
        System.out.println("Default Constructor");
    }

    LibraryBook(String title, String author, int price, boolean availability){
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = availability;
    }

    void borrow(){
        if(available){
            System.out.println("You borrowed "+ title);
        }
        else{
            System.out.println("Sorry book not available");
        }
    }

    public static void main(String args[]){
        LibraryBook b1 = new LibraryBook("Java Book", "Unknown", 1100, true);
        LibraryBook b2 = new LibraryBook("C++ Book", "Unknown2", 1000, false);
        b1.borrow();
        b2.borrow();
    }
}
