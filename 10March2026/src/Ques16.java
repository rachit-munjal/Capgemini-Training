import java.util.*;
public class Ques16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=10;i++){
            System.out.print((num * i) + " ");
            sum = sum + (num*i);
        }
        System.out.println();
        System.out.println(sum);
    }
}
