package Level1;

public class Book {
    String title;
    String author;
    int price;

    Book(){
        System.out.println("Default Constructor");
    }

    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Parameterized Constructor");
    }
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String args[]){
        Book b1 = new Book();
        Book b2 = new Book("Java", "rachit", 5000);
        b2.display();
    }
}
