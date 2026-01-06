package Level1;
import java.util.*;
/* Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
  */
public class Ques5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[10];
        for(int i = 0;i<10;i++){
            arr[i] = n*(i+1);
        }
        for(int j = 0;j<10;j++){
            System.out.println(n + " * " + (j+1) + " = " + arr[j]);
        }
    }
}
