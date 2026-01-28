/*Singly Linked List: Student Record Management*/
class Node{
    String name;
    int rollNo;
    int age;
    int grade;
    Node next;

    Node(String name, int rollNo, int age, int grade){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
class StudentList{
    Node head;

    void addAtBeginning(String name, int rollNo, int age, int grade){
        Node temp = new Node(name, rollNo, age, grade);
        temp.next = head;
        head = temp;
    }

    void addAtEnd(String name, int rollNo, int age, int grade){
        Node newNode = new Node(name, rollNo, age, grade);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void addAtPosition(String name, int rollNo, int age, int grade, int pos){
        if(pos <= 1){
            addAtBeginning(name, rollNo, age, grade);
            return;
        }

        Node newNode = new Node(name, rollNo, age, grade);
        Node temp = head;

        for(int i = 1;i<pos-1 && temp != null;i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Invalid Position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteByRollNumber(int rollNo){

        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.rollNo == rollNo){
            head = head.next;
            System.out.println("Deleted successfully");
            return;
        }
        Node temp = head;
        while(temp.next != null && temp.next.rollNo != rollNo){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Student not found");
        }
        else{
            temp.next = temp.next.next;
            System.out.println("Deleted Successfully");
            return;
        }
    }
    void searchByRollNo(int rollNo) {
        Node temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student Found:");
                System.out.println("Roll No: " + temp.rollNo);
                System.out.println("Name: " + temp.name);
                System.out.println("Age: " + temp.age);
                System.out.println("Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }
    void updateGrade(int rollNo, int newGrade) {
        Node temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }
    void display() {
        if (head == null) {
            System.out.println("No student records available.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println("Roll No: " + temp.rollNo +
                    ", Name: " + temp.name +
                    ", Age: " + temp.age +
                    ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

}
public class Ques1 {

    public static void main(String args[]){

        StudentList list = new StudentList();

        list.addAtEnd("Rahul", 34, 21, 12);
        list.addAtEnd("Rohit", 35, 21, 12);
        list.addAtEnd("Mehul", 31, 21, 12);

        System.out.println("Initial Student Records:");
        list.display();

        list.addAtBeginning("Aman", 30, 20, 11);

        list.addAtPosition("Neha", 32, 22, 10, 3);

        System.out.println("\nAfter Insertions:");
        list.display();

        System.out.println("\nSearching Roll No 35:");
        list.searchByRollNo(35);

        list.updateGrade(31, 9);

        list.deleteByRollNumber(34);

        System.out.println("\nFinal Student Records:");
        list.display();
    }
}
