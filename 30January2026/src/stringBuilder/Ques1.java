package stringBuilder;
/* Reverse a string using StrinBuilder function 'reverse' */
public class Ques1 {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("Hello");
        String ans = str.reverse().toString();
        System.out.println("Reversed String: " + ans);
    }
}