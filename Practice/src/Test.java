class Client {

    public static void main(String args[]) {

        // Client asks for company factory
        AbstractF a = new AbstractF();

        // Client chooses brand (Toyota)
        Mega factory = a.getFact("Toyota");

        // Client demands specific car
        Car car = factory.getCar("Fortuner");

        AbstractF b = new AbstractF();
        System.out.println(b.getFact("Mahindra").getCar("Thar Roxx"));

        // Client receives reference (address)
        System.out.println("Client received object reference: " + car);

        // Client uses the car
        car.speed();
        car.engine();
    }
}

/* ---------------- ABSTRACT FACTORY ---------------- */

class AbstractF {

    Mega getFact(String a) {

        if (a.equalsIgnoreCase("Toyota")) {
            return new Toyota();
        }

        if(a.equalsIgnoreCase("Mahindra")){
            return new Mahindra();
        }

        return null;
    }
}

/* ---------------- FACTORY INTERFACE ---------------- */

interface Mega {
    public Car getCar(String a);
}


/* ---------------- TOYOTA FACTORY ---------------- */

class Toyota implements Mega {

    public Car getCar(String a) {

        if (a.equalsIgnoreCase("Fortuner")) {
            return new Fortuner();
        }
        else if (a.equalsIgnoreCase("Innova")) {
            return new Innova();
        }
        else if (a.equalsIgnoreCase("Land Cruiser")) {
            return new LC();
        }

        return null;
    }
}

class Mahindra implements Mega{

    public Car getCar(String a){
        if(a.equalsIgnoreCase("XUV7XO")){
            return new XUV7XO();
        }
        else if(a.equalsIgnoreCase("Thar Roxx")){
            return new Thar();
        }
        return null;
    }
}

/* ---------------- CAR INTERFACE ---------------- */

interface Car {
    void speed();
    void engine();
}

class Fortuner implements Car {

    public void speed() {
        System.out.println("Speed: 180 kmph");
    }

    public void engine() {
        System.out.println("Engine: 2.8L Diesel");
    }
}

class Innova implements Car {

    public void speed() {
        System.out.println("Speed: 160 kmph");
    }

    public void engine() {
        System.out.println("Engine: 2.4L Diesel");
    }
}

class LC implements Car {

    public void speed() {
        System.out.println("Speed: 210 kmph");
    }

    public void engine() {
        System.out.println("Engine: 4.5L V8");
    }
}

class XUV7XO implements Car{

    public void speed(){
        System.out.println("Speed: 0 kmph");
    }
    public void engine(){
        System.out.println("2.2 L Turbo Diesel");
    }
}

class Thar implements Car{

    public void speed(){
        System.out.println("Speed: 10 kmph");
    }
    public void engine(){
        System.out.println("2.2 L Turbo Diesel");
    }
}