package Level2;

public class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev = rev + text.charAt(i);
        }
        return text.equals(rev);
    }

    void displayResult() {
        System.out.println(isPalindrome());
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker();
        p.text = "madam";
        p.displayResult();
    }
}

