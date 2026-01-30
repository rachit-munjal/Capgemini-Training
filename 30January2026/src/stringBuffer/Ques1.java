package stringBuffer;

/* Concat Strings using String Buffer */
public class Ques1 {
    public static void main(String[] args){
        String str[] = {"Hello", "World", "I", "am", "Rachit"};
        StringBuffer sb = new StringBuffer();

        for(int i = 0;i<str.length;i++){
            // used append twice to just add space after each string
            sb.append(str[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}
