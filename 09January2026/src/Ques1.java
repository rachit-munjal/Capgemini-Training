/* Count the number of vowels in a String */
import java.util.*;
public class Ques1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        int vowelCount = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
}
