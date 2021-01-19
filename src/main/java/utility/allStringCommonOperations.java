package utility;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class allStringCommonOperations {

    //Count the occurrence of a string
    public static int count(String patternStr, String target) {
        int count = 0;
         if(patternStr.length() <0 || target.length() <=0) {
           count =0;
         }
        else {
             Matcher matcher = Pattern.compile(patternStr, Pattern.CASE_INSENSITIVE).matcher(target);
             while (matcher.find()) {
                 count++;
             }
         }
        return count;
    }
}
