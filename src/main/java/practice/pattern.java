package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class pattern {

    public static void main(String[] args) {

        String stringWithDigits = "t123";
//        Pattern pattern = Pattern.compile(".*\\D.*");
//        boolean result = pattern.matcher(stringWithDigits).matches();
        boolean result = Pattern.matches(".*\\D.*", stringWithDigits);
        System.out.println(result );


    }

    public static class fileReadingFromTextFile {

        public static String fileRead (String filePath) throws IOException {
            FileReader fr = new FileReader(filePath);   //reads the file
            BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream
            StringBuffer sb = new StringBuffer();    //constructs a string buffer with no characters
            String line;
            while((line=br.readLine())!=null)
            {
                sb.append(line);      //appends line to string buffer
                sb.append("\n");     //line feed
            }
            fr.close();    //closes the stream and release the resources
            System.out.println("Contents of File: " + sb.toString());   //returns a string that textually represents the object
            return sb.toString();
        }
    }
}
