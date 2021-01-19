package hackerRank;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class camelCase {
    public static void main(String[] args) {

        String s = "saveChangesInTheEditor";
        char[] charArray = s.toCharArray();
        int upperCaseCharacterCount =0;
        int lowerCaseCharacter =0;
        if(isLowerCase(charArray[0])) {
            lowerCaseCharacter = lowerCaseCharacter+1;
        }
        for(int i =0; i< charArray.length; i++) {
            if(isUpperCase( charArray[i]) ) {
                upperCaseCharacterCount = upperCaseCharacterCount + 1;
            }
        }
       System.out.println(upperCaseCharacterCount+lowerCaseCharacter);

    }
}
