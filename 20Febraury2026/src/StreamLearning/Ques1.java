package StreamLearning;
/* Print all the odd numbers from the list using stream() */
import java.util.*;
import java.util.stream.Collectors;

public class Ques1 {
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(2);
        al.add(9);
        al.add(11);
        al.add(3);
        // One way of doing this
        al.stream().filter(x -> x % 2 != 0).forEach(System.out::println);
        // Second way of doing this
        ArrayList<Integer> ans = (ArrayList<Integer>)al.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
    }
}
