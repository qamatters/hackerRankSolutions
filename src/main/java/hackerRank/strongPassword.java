package hackerRank;


import java.util.regex.Pattern;

public class strongPassword {
    public static void main(String[] args) {
        String password = "AUzs-nV";
        int minimumNumber = minimumNumber(password.length(),password );
        System.out.println(minimumNumber);
}
    private static int minimumNumber(int length, String password) {
        int strLength = length;
        int MAX_LENGTH = 6;
        int TOTAL_CONDITIONS = 4;
        int matches = 0;
        if (Pattern.compile("\\d").matcher(password).find()) {
            matches = matches + 1;
            System.out.println(matches + " from number match");
        }
        if (Pattern.compile("[A-Z]").matcher(password).find()) {
            matches = matches + 1;
            System.out.println(matches + " from uppercase match");
        }
        if (Pattern.compile("[a-z]").matcher(password).find()) {
            matches = matches + 1;
            System.out.println(matches + " from lowercase match");
        }
        if (Pattern.compile("[!@#$%^&*()+-]").matcher(password).find()) {
            matches = matches + 1;
            System.out.println(matches + " from special charcater match");
        }
        System.out.println(matches);
        if((strLength <= MAX_LENGTH) && (MAX_LENGTH-strLength) <= (TOTAL_CONDITIONS- matches))
        {
            return (TOTAL_CONDITIONS- matches);
        } else if(strLength >= MAX_LENGTH) {
            return (TOTAL_CONDITIONS- matches);
        }
            else {
                return (MAX_LENGTH-strLength);
            }
        }
    }

