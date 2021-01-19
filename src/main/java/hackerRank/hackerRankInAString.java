package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class hackerRankInAString {

    public static void main(String[] args) {
        String input = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
        String hackerrankInString = hackerrankInString(input);
        System.out.println(hackerrankInString);
    }

    public static String hackerrankInString(String input) {
        String word = "hackerrank";
        String exist = "Yes";
        String doesNotExist = "No";
        char[] wordChar = word.toCharArray();
        List<Character> inputChars = input
                .chars()
                .mapToObj(c-> (char)c)
                .collect(Collectors.toList());
        List<Character> newWords = new ArrayList<>(input.length());
        int i, j;
        for (i =0 ; i< wordChar.length ; i++) {
            for (j = 0; j < inputChars.size(); j++) {

                System.out.println("----------------------------------------------------------------");
                System.out.println("searching word " + wordChar[i] + " in " + inputChars);
                System.out.println("----------------------------------------------------------------");

                if (wordChar[i] == inputChars.get(j)) {
                    System.out.println(wordChar[i] + " is found in " +  inputChars + " so adding it into word");
                    newWords.add(inputChars.get(j));
                    System.out.println(newWords + " words after adding " + wordChar[i]);
                    inputChars.remove(j);
                    System.out.println("latest input string " + inputChars + "now after adding " + wordChar[i]);
                    System.out.println("----------------------------------------------------------------");
                    break;
                } else {
                    System.out.println(wordChar[i] + " is not found in " +  inputChars + " so removing it from input");
                    inputChars.remove(j);
                    j=j-1;
                    System.out.println(inputChars + "input after word " + wordChar[i] + " not found ");
                    System.out.println("----------------------------------------------------------------");
                }
            }
        }
        String newWordAsString = newWords.stream().map(Object::toString).collect(Collectors.joining());
        System.out.println(newWordAsString);
        if(newWordAsString.contentEquals(word.trim())) {
            return exist;
        } else {
            return doesNotExist;
        }
    }
}
