package BinarySearch;

public class Ques4 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4};
        int target = 2;

        int first = -1, last = -1;
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == target) {
                first = m;
                r = m - 1;
            } else if (arr[m] < target) l = m + 1;
            else r = m - 1;
        }

        l = 0; r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == target) {
                last = m;
                l = m + 1;
            } else if (arr[m] < target) l = m + 1;
            else r = m - 1;
        }

        System.out.println("First: " + first + " Last: " + last);
    }
}

