package Level1;
import java.util.*;
/* Write a program to return all the characters in a string using the user-defined method,
compare the result with the String built-in toCharArray() method, and display the result */
public class Ques3 {
    public static void StringToChar(String s){
        System.out.println("User defined String to Char returns: ");
        for(int i = 0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringToChar(s);
        char[] charArr = s.toCharArray();
        System.out.println("build-in toCharArray returns: ");
        for(int i = 0;i<charArr.length;i++){
            System.out.print(charArr[i] + " ");
        }
    }
}
