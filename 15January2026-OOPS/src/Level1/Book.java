package Level1;

public class Book {
    String title;
    String author;
    double price;

    void displayDetails() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.title = "How to Code in Java";
        b.author = "Rachit";
        b.price = 2990;
        b.displayDetails();
    }
}

