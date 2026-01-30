package InputStreamReader;

import java.io.*;

public class Ques2 {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                FileWriter fw = new FileWriter("output.txt")
        ) {
            String input;
            while (true) {
                input = br.readLine();
                if (input.equalsIgnoreCase("exit")) break;
                fw.write(input + "\n");
            }
        } catch (IOException e) {
            System.out.println("I/O Error");
        }
    }
}

