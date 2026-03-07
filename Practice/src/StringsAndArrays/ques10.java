package StringsAndArrays;
public class ques10 {

    public static int maxSum(int[] arr, int k) {
        int ans = 0;

        for (int op = 0; op < k; op++) {
            int maxIndex = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            ans += arr[maxIndex];
            arr[maxIndex] = (arr[maxIndex] + 2) / 3;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,100,4};
        int k = 2;

        System.out.println(maxSum(arr, k)); // Output: 40
    }
}