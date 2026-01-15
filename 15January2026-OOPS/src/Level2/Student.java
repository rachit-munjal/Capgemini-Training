package Level2;

public class Student {
    String name;
    int rollNumber;
    int marks;

    String calculateGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 50)
            return "C";
        else
            return "Fail";
    }

    void displayDetails() {
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(marks);
        System.out.println(calculateGrade());
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Rahul";
        s.rollNumber = 12;
        s.marks = 82;
        s.displayDetails();
    }
}

