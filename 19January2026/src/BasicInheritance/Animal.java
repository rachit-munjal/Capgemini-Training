package BasicInheritance;

public class Animal {
    String name;
    int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void makeSound(){
        System.out.println("Animal makes sound");
    }
    public static void main(String[] args) {

        Animal dog = new Dog("Tommy", 3);
        Animal cat = new Cat("Catty", 2);
        Animal bird = new Bird("popat", 1);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    public void makeSound() {
        System.out.println(name + " Woofs!");
    }
}
class Cat extends Animal{
    public Cat(String name, int age){
        super(name, age);
    }
    public void makeSound() {
        System.out.println(name + " Meows!");
    }
}
class Bird extends Animal{
    public Bird(String name, int age){
        super(name, age);
    }
    public void makeSound() {
        System.out.println(name + " Chirps!");
    }
}
