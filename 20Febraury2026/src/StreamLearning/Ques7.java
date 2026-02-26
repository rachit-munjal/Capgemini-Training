package StreamLearning;
import java.util.*;
public class Ques7 {
    public static void main(String args[]){
        List<Integer> x = Arrays.asList(1,2,3,4,5,6,7);
        double avg = x.stream().mapToInt(y -> y ).average().getAsDouble();
        System.out.println(x);
    }
}
