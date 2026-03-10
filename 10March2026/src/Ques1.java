import java.util.*;

public class Ques1 {

    public static int minHouses(int r, int unit, int arr[]) {

        if (arr == null) {
            return -1;
        }

        int totalFoodRequired = r * unit;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum >= totalFoodRequired) {
                return i + 1;
            }
        }

        return 0;
    }

    public static void main(String args[]) {
        int arr[] = {2,8,0,5,7,4,1,2};
        int r = 7;
        int unit = 3;

        System.out.println(minHouses(r, unit, arr));
    }
}