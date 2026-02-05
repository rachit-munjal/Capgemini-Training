import java.util.*;
public class Power_Calculation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int exponent=sc.nextInt();
        double result=Math.pow(base,exponent);
        System.out.print(result);
    }
}
