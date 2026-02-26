package StreamLearning;

import java.util.*;

public class Ques4 {
    public static void main(String args[]){
        ArrayList<String> ans = new ArrayList<>(
                Arrays.asList("Aman","Rohit","Ankit","Simran","Arjun")
        );
        ans.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);
    }
}
