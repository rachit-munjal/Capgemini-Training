package StreamLearning;

import java.util.*;

public class Ques5 {
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(30);
        al.add(25);
        al.add(40);
        al.add(60);
        al.add(120);

        al.stream().filter(x -> x % 3 == 0 && x % 5 == 0).forEach(System.out::println);
    }
}
