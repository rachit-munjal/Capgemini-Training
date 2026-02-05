import java.util.*;
public class Celsius_to_Fahrenheit_Conversion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int temperature_in_celsius=sc.nextInt();
        int temperature_in_fahrenheit=(temperature_in_celsius*9)/5+32;
        System.out.print(temperature_in_fahrenheit);
    }
}
