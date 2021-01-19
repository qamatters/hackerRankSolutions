package practiceCode;
import java.io.IOException;
import static practiceCode.fileReadingFromTextFile.fileRead;

public class coundWords {
    public static void main(String[] args) throws IOException {
        String filePath = "src//sample.txt";
        String searchedData = "Linux";
        String data =   fileRead(filePath);
        System.out.println(data);
     int count = utility.allStringCommonOperations.count(searchedData, data);
     System.out.println("occurrence of word is " + count);
    }

}
