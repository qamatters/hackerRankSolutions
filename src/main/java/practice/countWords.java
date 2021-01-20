package practice;

import java.io.IOException;

import static practice.pattern.fileReadingFromTextFile.fileRead;

public class countWords {

    public static void main(String[] args) {
        String filePath = "src//main//java//sample.txt";

        String searchedData = "Linux";
        String data = null;
        try {
            data = fileRead(filePath);
        } catch (IOException e) {
            e.printStackTrace( );
        }
        System.out.println(data);
        int count = utility.allStringCommonOperations.count(searchedData, data);
        System.out.println("occurrence of word is " + count);
    }
}
