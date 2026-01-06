package Level1;
import java.util.*;
/* Create a program to find the mean height of players present in a football team. */
public class Ques6 {
    public static void main(String args[]){
        int arr[] = new int[11];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0;i<11;i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        int mean = sum / 11;
        System.out.println("The mean height of the team is " + mean);
    }
}
