package Level1;
import java.util.*;
/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.*/

public class Ques1 {
    public static void main(String args[]){
        int n = 10;
        int arr[] = new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0;j<n;j++){
            if(arr[j] >= 18){
                System.out.println("The student with age "+arr[j]+" can vote");
            }
            else if(arr[j] < 18 && arr[j] >= 1){
                System.out.println("The student with age "+arr[j]+" cannot vote");
            }
            else{
                System.out.println("Invalid Age");
            }
        }
    }
}
