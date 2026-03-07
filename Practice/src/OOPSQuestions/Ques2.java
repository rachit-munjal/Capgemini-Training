package OOPSQuestions;

import java.util.Scanner;

abstract class Calculator{
    abstract int add(int a, int b);
}
class Adder extends Calculator{
    public int add(int a, int b){
        return a + b;
    }
}
class Multiplier{
    Adder adding = new Adder();

    int multiply(int a, int b){
        int result = 0;
        for(int i = 0;i<b;i++){
            result = adding.add(result, a);
            System.out.println(result + " " + a);
        }
        return result;
    }
}
public class Ques2{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Adder adder = new Adder();
        Multiplier multiplier = new Multiplier();

        System.out.println(adder.add(a,b));
        System.out.println("Multiply:");
        int product = multiplier.multiply(a,b);
        System.out.println(product);
    }
}
