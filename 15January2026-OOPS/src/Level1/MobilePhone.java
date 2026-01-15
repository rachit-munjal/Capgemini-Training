package Level1;

public class MobilePhone {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }

    public static void main(String[] args) {
        MobilePhone m = new MobilePhone();
        m.brand = "Samsung";
        m.model = "Galaxy A14";
        m.price = 15000;
        m.displayDetails();
    }
}

