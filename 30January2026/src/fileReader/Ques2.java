package fileReader;

import java.io.*;

public class Ques2 {
    public static void main(String[] args) {
        String target = "java";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String w : words) {
                    if (w.equalsIgnoreCase(target)) {
                        count++;
                    }
                }
            }
            System.out.println("Occurrences: " + count);
        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}





