package StringsAndArrays;
/* Longest Even Length String */

public class Ques7 {
    public static void main(String args[]){
        String str = "We test with sample words";
        String arr[] = str.split(" ");
        int maxlength = 0;
        int index = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i].length() % 2 == 0 && arr[i].length() > maxlength){
                maxlength = arr[i].length();
                index = i;
            }
        }
        if(maxlength == 0 && index == -1){
            System.out.println("00");
        }
        else{
            System.out.println(maxlength);
            System.out.println(arr[index]);
        }
    }
}
