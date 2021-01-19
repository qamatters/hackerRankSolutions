/*
Questiosn are picked from geeksForGeeks AMZON SDET questions
https://www.geeksforgeeks.org/amazon-interview-experience-set-128-sdet/
https://practice.geeksforgeeks.org/explore/?company%5B%5D=Amazon&page=1
 */

package geeksForGeeksSDETQuestions;


public class printFirstCharacterForAllWords {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String words = "geeks for geeks";
        String output = firstCharacter(words);
        System.out.println( output); // output gfg
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        double totalTimeInSecond = (double) totalTime / 1_000_000_000;
        System.out.println(totalTimeInSecond + " seconds");


    }

    private static String firstCharacter(String words) {
        String output = "";
        String [] individualWords =  words.split("\\s+");
        for(int i =0;i<individualWords.length;i++) {
            output = output + String.valueOf(individualWords[i].charAt(0));
        }
        return  output;
    }
}
