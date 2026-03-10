import java.util.*;
/* Array Equilibrium */
public class Ques4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int totalSum = 0;
        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }

        int leftSum = 0;
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            int rightSum = totalSum - leftSum - arr[i];

            if(rightSum == leftSum){
                System.out.println(i);
                found = true;
                break;
            }

            leftSum += arr[i];
        }

        if(!found){
            System.out.println(-1);
        }
    }
}