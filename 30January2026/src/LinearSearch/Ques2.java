package LinearSearch;

public class Ques2 {
    public static void main(String[] args) {
        String[] sentences = {
                "Java is powerful",
                "I love programming",
                "Learning data structures"
        };

        String word = "Java";
        String result = "Not Found";

        for (String s : sentences) {
            if (s.contains(word)) {
                result = s;
                break;
            }
        }

        System.out.println(result);
    }
}


