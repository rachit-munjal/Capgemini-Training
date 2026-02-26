package StreamLearning;
import java.util.*;
class Student{
    int marks;
    int rollno;
    String name;

    Student(int x, int y, String z){
        marks = x;
        rollno = y;
        name = z;
    }
    int getMarks(){
        return marks;
    }
    int getRollno(){
        return rollno;
    }
    String getName(){
        return name;
    }
}
public class Ques10 {
    public static void main(String args[]){
        Student x[] = {new Student(150, 75, "Anita"), new Student(75, 50, "Basanti"), new Student(170, 10, "Champa")};
        OptionalDouble avg = Arrays.stream(x).mapToInt(Student -> Student.getMarks()).average();
        if(avg.isPresent()){
            System.out.println(avg.getAsDouble());
        }
        else{
            System.out.println("Its null");
        }
    }
}
