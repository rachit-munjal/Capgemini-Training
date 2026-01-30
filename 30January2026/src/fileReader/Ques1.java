package fileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ques1 {
    public static void main(String[] args){
        try {
            FileReader fs = new FileReader("/Users/rachit/Documents/Capgemini-Training/30January2026/src/fileReader/test.txt");
            BufferedReader br = new BufferedReader(fs);
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error occured while reading the file");
        }
    }
}
