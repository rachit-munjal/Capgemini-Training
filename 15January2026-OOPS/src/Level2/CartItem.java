package Level2;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(int qty) {
        quantity = quantity + qty;
    }

    void removeItem(int qty) {
        if (quantity >= qty)
            quantity = quantity - qty;
    }

    void displayTotalCost() {
        System.out.println(price * quantity);
    }

    public static void main(String[] args) {
        CartItem c = new CartItem();
        c.itemName = "Notebook";
        c.price = 50;
        c.addItem(4);
        c.removeItem(1);
        c.displayTotalCost();
    }
}

