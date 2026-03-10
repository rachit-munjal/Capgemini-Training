import java.util.*;
/* String Transformation */
public class Ques3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 'a'){
                arr[i] = 'b';
            }
            else if(arr[i] == 'b'){
                arr[i] = 'a';
            }
        }
        String result = new String(arr);
        System.out.println(result);
    }
}
