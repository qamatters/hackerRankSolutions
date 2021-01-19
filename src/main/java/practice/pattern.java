package practice;

import java.util.regex.Pattern;

public class pattern {

    public static void main(String[] args) {

        String stringWithDigits = "t123";
//        Pattern pattern = Pattern.compile(".*\\D.*");
//        boolean result = pattern.matcher(stringWithDigits).matches();
        boolean result = Pattern.matches(".*\\D.*", stringWithDigits);
        System.out.println(result );


    }
}
