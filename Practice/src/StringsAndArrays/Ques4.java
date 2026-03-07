package StringsAndArrays;

import java.util.Locale;

public class Ques4 {
    public static String spam_words[] = {"buy", "offer", "free"};
    public static boolean checkSpam(String word){
        word = word.toLowerCase();
        for(int i = 0;i< spam_words.length;i++){
            if(word.contains(spam_words[i])){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        String subject[] = {"Buy now buy", "Limited time Offer", "hello friend"};
        for(int i = 0;i<subject.length;i++){
            if(checkSpam(subject[i])){
                System.out.println("Spam");
            }
            else{
                System.out.println("Not_Spam");
            }
        }
    }
}
