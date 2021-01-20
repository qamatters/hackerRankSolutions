package interviewProblems;

import java.util.HashMap;

public class occuranceOfDuplicateInString {

    public static void main(String[] args) {

        String input = "deepakMathpal";
        char []charArray = input.toCharArray();

        HashMap<Character, Integer> baseMap = new HashMap<>();

        for(char c: charArray) {
            if(baseMap.containsKey(c)) {
                baseMap.put(c,baseMap.get(c)+1);
            } else {
                baseMap.put(c,1);
            }
        }

        baseMap.forEach((key, value) ->
        {
            System.out.print(key + ":");
            System.out.print(value);
            System.out.println("\n" );

        });
    }
}
