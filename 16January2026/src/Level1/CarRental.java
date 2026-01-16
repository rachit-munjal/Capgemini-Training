package Level1;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    CarRental() {
        customerName = "Unknown";
        carModel = "Hatchback";
        rentalDays = 1;
        totalCost = calculateCost();
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        totalCost = calculateCost();
    }

    double calculateCost() {
        double pricePerDay;

        if (carModel.equals("Hatchback")) {
            pricePerDay = 1000;
        } else if (carModel.equals("Sedan")) {
            pricePerDay = 1500;
        } else if (carModel.equals("SUV")) {
            pricePerDay = 2000;
        } else {
            pricePerDay = 1200;
        }

        return rentalDays * pricePerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car: " + carModel);
        System.out.println("Days: " + rentalDays);
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Rahul", "Sedan", 3);
        CarRental r3 = new CarRental("Anita", "SUV", 2);

        r1.display();
        r2.display();
        r3.display();
    }
}
