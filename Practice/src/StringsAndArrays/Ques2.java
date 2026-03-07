package StringsAndArrays;
/* Given a List of Strings and return the strings in which first and last character is a vowel */
import java.util.*;

public class Ques2 {
    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static void main(String args[]){
        List<String> ll = new ArrayList<>();
        ll.add("orange");
        ll.add("apple");
        ll.add("kiwi");
        ll.add("papaya");
        ll.add("banana");

        List<String> result = new ArrayList<>();

        for(String word : ll){
            char first = word.charAt(0);
            char last = word.charAt(word.length()-1);

            if(isVowel(first) && isVowel(last)){
                result.add(word);
            }
        }
        System.out.println(result);

    }
}
