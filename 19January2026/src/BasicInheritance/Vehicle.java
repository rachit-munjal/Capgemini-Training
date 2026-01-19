package BasicInheritance;

public class Vehicle {
    int maxSpeed;
    String fuelType;
    public Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    public void displayInfo(){
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle{
    int seatCapacity;
    public Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
}

class Truck extends Vehicle{
    int loadCapacity;
    public Truck(int maxSpeed, String fuelType, int loadCapacity){
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public void displayInfo() {
        super.displayInfo();
    }
}