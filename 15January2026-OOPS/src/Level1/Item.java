package Level1;

public class Item {
    int itemCode;
    String itemName;
    double price;

    double totalCost(int quantity) {
        return price * quantity;
    }

    void displayDetails(int quantity) {
        System.out.println(itemCode);
        System.out.println(itemName);
        System.out.println(price);
        System.out.println(totalCost(quantity));
    }

    public static void main(String[] args) {
        Item i = new Item();
        i.itemCode = 201;
        i.itemName = "Pen";
        i.price = 10;
        i.displayDetails(5);
    }
}

