package BinarySearch;

public class Ques2 {
    public static void main(String[] args) {
        int[] arr = {1,3,20,4,1,0};
        int l = 0, r = arr.length - 1;

        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] < arr[m + 1]) l = m + 1;
            else r = m;
        }

        System.out.println("Peak element index: " + l);
    }
}

