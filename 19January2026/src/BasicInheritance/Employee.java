package BasicInheritance;

public class Employee {
    String name;
    int id;
    int salary;
    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
    public Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public static void main(String args[]){
        Employee e1 = new Manager("Rahul", 144, 10000, 4);
        Employee e2 = new Developer("Rohit", 123, 8000, "Python");
        Employee e3 = new Intern("Mohit", 111, 2000, "Chitkara");

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
class Manager extends Employee{
    int teamSize;
    public Manager(String name, int id, int salary, int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: "+ teamSize);
    }
}
class Developer extends Employee{
    String developmentLanguage;
    public Developer(String name, int id, int salary, String developmentLanguage){
        super(name, id, salary);
        this.developmentLanguage = developmentLanguage;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Language: "+ developmentLanguage);
    }
}
class Intern extends Employee{
    String collegeName;
    public Intern(String name, int id, int salary, String collegeName){
        super(name, id, salary);
        this.collegeName = collegeName;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("College: "+ collegeName);
    }
}