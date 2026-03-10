import java.util.*;
public class Ques17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int lowerLimit = sc.nextInt();
        int upperLimit = sc.nextInt();
        func(lowerLimit, upperLimit);
    }
    public static boolean isPalindrome(int num) {
        int temp = num;
        int reverse = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }
        if (reverse == num) {
            return true;
        } else {
            return false;
        }
    }
    public static void func(int lowerLimit, int upperLimit){
        for(int i = lowerLimit; i<=upperLimit;i++){
            if(isPalindrome(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
