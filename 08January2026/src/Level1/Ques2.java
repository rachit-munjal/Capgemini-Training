package Level1;
import java.util.*;
/* Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method
substring() to find the substring of the text. Finally Compare the the two strings and display the results */
public class Ques2 {
    public static String StringUsingCharAt(String s, int start, int end){
        String ans = "";
        for(int i = start;i<end;i++){
            ans = ans + s.charAt(i);
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String substr1 = StringUsingCharAt(s, start, end);
        String substr2 = s.substring(start, end);
        System.out.println("Substring using charAt(): "+substr1);
        System.out.println("Substring using substr: "+substr2);

        if(substr1.equals(substr2)){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Substrings are not equal");
        }
    }
}
