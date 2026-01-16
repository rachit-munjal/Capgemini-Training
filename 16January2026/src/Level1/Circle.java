package Level1;

public class Circle {
    double radius;

    Circle(){
        System.out.println("Default Constructor");
    }
    Circle(double radius){
        this.radius = radius;
    }
    void display(){
        System.out.println("Radius: "+ radius);
    }

    public static void main(String args[]){
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        c2.display();
    }
}
