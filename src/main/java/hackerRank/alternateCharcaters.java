package hackerRank;

import java.util.List;
import java.util.stream.Collectors;

public class alternateCharcaters {

    public static void main(String[] args) {

        String s = "BBBBB";
        int count = alternateCharactersMethod (s);
        System.out.println(count);
    }

    private static int alternateCharactersMethod(String s) {
        int count = 0;
        List<Character> inputChars = s
                .chars()
                .mapToObj(c-> (char)c)
                .collect(Collectors.toList());

        for(int i =0; i < s.length()-1; i++) {
            if (inputChars.get(i) == inputChars.get(i+1)) {
               inputChars.add(' ');
               count = count+1;
            }
        }

        return count;
    }
}
