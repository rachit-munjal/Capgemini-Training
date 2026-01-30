package stringBuilder;

import java.util.HashSet;
import java.util.Scanner;

/* Remove Duplicates from a String using StringBuilder and HashSet */
public class Ques2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder str = new StringBuilder();
        HashSet<Character> hs = new HashSet<>();

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(!hs.contains(c)){
                hs.add(c);
                str.append(c);
            }
        }
        System.out.println("String without duplicates: " + str.toString());
    }
}
