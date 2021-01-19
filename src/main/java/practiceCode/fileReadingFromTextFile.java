package practiceCode;

import java.io.*;


public class fileReadingFromTextFile {

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

