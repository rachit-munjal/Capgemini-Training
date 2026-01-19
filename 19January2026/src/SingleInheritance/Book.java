package SingleInheritance;

public class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }

    public static void main(String[] args){
        Book b1 = new Author("Object-Oriented Programming", 2023, "John Doe", "Software engineer and Java instructor");
        b1.displayInfo();
    }
}
class Author extends Book{
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}
