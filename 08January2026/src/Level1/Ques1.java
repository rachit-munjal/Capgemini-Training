package Level1;
import java.util.*;
/* Write a program to compare two strings using the charAt() method and check the result with the built-in
String equals() method */
public class Ques1 {
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean checking = compareUsingCharAt(s1, s2);
        System.out.println("charAt() returns: "+checking);
        boolean checking2 = s1.equals(s2);
        System.out.println(".equals returns: "+checking2);

        if (checking == checking2) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results are different.");
        }
    }
}
