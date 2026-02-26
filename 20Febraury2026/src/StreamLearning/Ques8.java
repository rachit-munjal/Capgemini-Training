package StreamLearning;
import java.util.*;
public class Ques8 {
    public static void main(String[] args){
        List<Integer> al = Arrays.asList(5,10,15,20,55,100,56,150,500);
        al.stream()
                .map(x -> String.valueOf(x))
                .filter(y -> y.startsWith("5"))
                .forEach(System.out::println);
    }
}
