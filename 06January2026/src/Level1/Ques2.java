package Level1;
import java.util.*;
/*Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less*/
public class Ques2 {
    public static void main(String args[]){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<5;i++){
            if(arr[i] > 0){
                if(arr[i] % 2 == 0){
                    System.out.println("Its an even positive number");
                }
                else{
                    System.out.println("Its an odd positive number");
                }
            }
            else if (arr[i] < 0){
                System.out.println("Its a negative number");
            }
            else{
                System.out.println("Its a zero");
            }
        }
    }
}
