package Level1;

public class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Rahul";
        e.id = 123;
        e.salary = 10000;
        e.displayDetails();
    }
}

