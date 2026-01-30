package BinarySearch;

public class Ques3 {
    public static void main(String[] args) {
        int[][] mat = {
                {1,3,5},
                {7,9,11},
                {13,15,17}
        };
        int target = 9;

        int r = mat.length, c = mat[0].length;
        int l = 0, h = r * c - 1;
        boolean found = false;

        while (l <= h) {
            int m = (l + h) / 2;
            int val = mat[m / c][m % c];
            if (val == target) {
                found = true;
                break;
            }
            if (val < target) l = m + 1;
            else h = m - 1;
        }

        System.out.println(found);
    }
}

