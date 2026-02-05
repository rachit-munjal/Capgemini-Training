import java.util.*;
public class Area_of_a_Circle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        double area= Math.PI * Math.pow(radius,2);
        System.out.printf("%.2f",area);
    }
}
