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

    public static void main(String args[]){
        Vehicle v1 = new Car(210, "Hybrid", 7);
        Vehicle v2 = new Truck(100, "Diesel", 1000);
        Vehicle v3 = new MotorCycle(160, "Petrol");

        v1.displayInfo();
        v2.displayInfo();
        v3.displayInfo();
    }
}

class Car extends Vehicle{
    int seatCapacity;
    public Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
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
        System.out.println("Load Capacity: " + loadCapacity);
    }
}

class MotorCycle extends Vehicle{
    public MotorCycle(int maxSpeed, String fuelType){
        super(maxSpeed, fuelType);
    }
    public void displayInfo() {
        super.displayInfo();
    }
}