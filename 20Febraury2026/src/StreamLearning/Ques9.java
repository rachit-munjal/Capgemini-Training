package StreamLearning;
import java.util.*;
public class Ques9 {
    public static void main(String args[]){
        String arr[] = {"akanksha", "anamika", "rubika", "kashvi", "amrita", "vanshika"};
        Arrays.stream(arr)
                .filter(s -> s.startsWith("a") && s.endsWith("a"))
                .sorted()
                .forEach(System.out::println);
    }
}
