package dailyCodeWriting;

import java.util.HashMap;
import java.util.Stack;
import java.util.stream.Collectors;

public class dailyWriting {

// 21 st January 2021

    public static void main(String[] args) {
        //find duplicate from string
        String input = "madam121";
        findDuplicate(input);
        System.out.println("-------------------------------------------------------" );
        //find duplicate from number
        int number = 123145;
        String numberasString = String.valueOf(number);
        findDuplicate(numberasString);
        System.out.println("-------------------------------------------------------" );
        // reverseString with stack
        reverseStingWithStack(input);
        System.out.println("-------------------------------------------------------" );
        // palindrom
        palindrom(input);
        System.out.println("-------------------------------------------------------" );
        //remove digit
        removeDigit(input);
        System.out.println("-------------------------------------------------------" );
        //removechars
        removeChar(input);
        // printFirstCharacterFromAllWords
        String word = "My name is Deepak";
        printFirstCharacterFromAllWords(word);
        System.out.println("-------------------------------------------------------" );
        //oddOccuranceFirstEvenLater
        oddOccuranceFirstEvenLater(number);
        System.out.println("-------------------------------------------------------" );
        // removeduplicate
        removeDuplicateFromString(input);
        System.out.println("-------------------------------------------------------" );
        removeDuplicateFromNumber(number);

    }

    private static void removeDuplicateFromNumber(int number) {
        int newNumber = Integer.parseInt(String.valueOf(number).chars().mapToObj(c ->  (char)c).collect(Collectors.toSet()).stream().map(String::valueOf).collect(Collectors.joining()));
        System.out.println(newNumber );
    }

    private static void removeDuplicateFromString(String input) {
        String newWord = input.chars().mapToObj(c -> (char) c).collect(Collectors.toSet()).stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println(newWord );
    }

    private static void oddOccuranceFirstEvenLater(int number) {
        String s = String.valueOf(number);
        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();
        for(int i =0; i<s.length(); i++) {
          sb = sb.append(charArray[i]);
          i++;
        }
        for(int i =1; i<s.length(); i++) {
            sb = sb.append(charArray[i]);
            i++;
        }
        System.out.println(Integer.parseInt(String.valueOf(sb)));

    }

    private static void printFirstCharacterFromAllWords(String word) {
        String output= "";
        String [] s = word.split("\\s");
        for(int i = 0; i< s.length; i++) {
            output = output + s[i].charAt(0);
        }
        System.out.println(output );
    }

    private static void removeChar(String input) {
        String newWord = input.replaceAll("\\D", "");
        System.out.println(newWord );
    }

    private static void removeDigit(String input) {
        String newWord = input.replaceAll("\\d", "");
        System.out.println(newWord );
    }

    private static void palindrom(String input) {
        if (input.equalsIgnoreCase(reverseStingWithStack(input))) {
            System.out.println("Its a palindrom" );
        } else {
            System.out.println("Its not a palindrom" );
        }

    }

    private static String reverseStingWithStack(String input) {
        char[] charArray = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i =0; i< charArray.length; i++) {
            stack.push(charArray[i]);
        }
        for(int i =0; i<charArray.length; i++) {
            charArray[i] = stack.pop();
        }
        return String.valueOf(charArray);
    }

    private static void findDuplicate(String input) {
        char[] charArray = input.toCharArray();
        HashMap<Character, Integer> baseMap = new HashMap<>();
        for (char c : charArray) {
            if(baseMap.containsKey(c)) {
                baseMap.put(c, baseMap.get(c) +1);
            }
            else {
                baseMap.put(c, 1);
            }
        }
        baseMap.forEach((key, value) -> {
                    System.out.print(key + ":" );
                    System.out.print(value);
                    System.out.println("\n" );
                }
        );
    }
}
