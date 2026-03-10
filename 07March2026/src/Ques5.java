import java.util.*;
/* Array Rotation */
public class Ques5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array??");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Elements of array??");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("How many places do you want to rotate this array ");
        int d = sc.nextInt();
        for(int i = 0;i<d;i++){
            int first = arr[0];
            for(int j = 0;j<n-1;j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = first;
        }
        for(int k = 0;k<arr.length;k++){
            System.out.print(arr[k] + " ");
        }
    }
}
