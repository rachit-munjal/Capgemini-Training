public class Ques3 {
    public static int passWordCheck(String str){
        if(str.length() < 4){
            return 0;
        }
        if(Character.isDigit(str.charAt(0))){
            return 0;
        }
        boolean hasDigit = false;
        boolean hasCapital = false;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ' ' || ch == '/'){
                return 0;
            }
            if(Character.isDigit(ch)){
                hasDigit = true;
            }
            if(Character.isUpperCase(ch)){
                hasCapital = true;
            }
        }
        if(hasCapital && hasDigit){
            return 1;
        }
        return 0;
    }
    public static void main(String args[]){
        String str = "1bC1_d";
        System.out.println(passWordCheck(str));
    }
}
