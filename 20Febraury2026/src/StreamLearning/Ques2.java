package StreamLearning;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Ques2 {
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(50);
        al.add(34);
        al.add(80);
        al.add(72);
        al.add(42);

        al.stream().filter(x -> x >= 50).forEach(System.out::println);

        ArrayList<Integer> ans = (ArrayList<Integer>) al.stream().filter(x -> x > 50).collect(Collectors.toList());
        System.out.println(ans);
    }
}
