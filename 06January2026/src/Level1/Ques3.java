package Level1;
import java.util.*;

public class Ques3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[10];

        int i = 1;
        while (i <= 10) {
            arr[i - 1] = n * i;
            i++;
        }

        int j = 0;
        while (j < 10) {
            System.out.println(n + " X " + (j + 1) + " = " + arr[j]);
            j++;
        }

        sc.close();
    }
}
