package Level1;
import java.util.*;
/* Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers  */
public class Ques4 {
    public static void main(String args[]){
        double arr[] = new double[10];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(true){
            if(i > 9){
                break;
            }
            double temp = sc.nextDouble();
            if(temp <= 0){
                break;
            }
            arr[i++] = temp;
        }
        int j = 0;
        double sum = 0;
        while(j<arr.length){
            sum = sum + arr[j];
            j++;
        }
        System.out.println(sum);
    }
}
