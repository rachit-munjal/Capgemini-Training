package StreamLearning;

import java.util.*;

public class Ques3 {
    public static void main(String[] args){
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(3);
        a1.add(2);
        a1.add(5);
        a1.add(7);
        a1.add(4);
        a1.add(6);
        a1.add(8);

        long counts = a1.stream().filter(x -> x % 2 == 0).count();
        System.out.println(counts);
    }
}
