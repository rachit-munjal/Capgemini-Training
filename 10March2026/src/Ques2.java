public class Ques2 {
    public static void main(String args[]){
        String str = "0C1A1B1C1C1B0A0";
        System.out.println(BinaryOperations(str));
    }
    public static int BinaryOperations(String str){
        int n = str.length();
        int result = str.charAt(0) - '0';
        for(int i = 1;i<n;i=i+2){
            char operation = str.charAt(i);
            int next = str.charAt(i+1) - '0';

            if(operation == 'A'){
                result = result & next;
            }

            if(operation == 'B'){
                result = result | next;
            }

            if(operation == 'C'){
                result = result ^ next;
            }
        }
        return  result;
    }
}
