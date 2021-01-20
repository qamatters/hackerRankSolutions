package practice;


import java.util.*;
import java.util.stream.Collectors;

public class findDuplicate {

    public static void main(String[] args) {
        List<Integer> ar = Arrays.asList(1, 2, 3, 4, 5, 1, 3, 6, 7);
        System.out.println("Actual Array: " + ar);
        System.out.println("-----------------------------------------------------------");


        HashSet<Integer> unique = new HashSet<>(ar);
        System.out.println("unique elements in integer array after putting them in hashset are " + unique);

        System.out.println("-----------------------------------------------------------");

        HashSet<Integer> duplicates1 = new HashSet<>( );

        for (int i = 0; i < ar.size( ); i++) {

            if (duplicates1.add(ar.get(i)) == false) {
                System.out.println("duplicates are " + ar.get(i));
            }
        }

            System.out.println("-----------------------------------------------------------");

            List<Integer> list1 = ar.stream( ).distinct( ).collect(Collectors.toList( ));
            System.out.println("Print unique elements with the help of Java 8 distinct method " + list1);
            System.out.println("-----------------------------------------------------------");

            Set<Integer> set1 = ar.stream( ).collect(Collectors.toSet( ));
            System.out.println("Print unique elements with the help of Set collection " + set1);
            System.out.println("-----------------------------------------------------------");


            String s = "ABCDAB";
            System.out.println("Actual String is:  " + s );
            System.out.println("-----------------------------------------------------------");

            String distinctChar = s.chars( ).mapToObj(c -> (char) c).collect(Collectors.toSet( )).stream( ).map(String::valueOf).collect(Collectors.joining( ));
            System.out.println("After removing duplicate characters from the string with the help of java 8 menthods,new string is : "  + distinctChar);
            System.out.println("-----------------------------------------------------------");

            Set<Character> duplicate1 = s.chars( ).mapToObj(c -> (char) c).collect(Collectors.toSet( ));
            System.out.println("After removing duplicate characters from the string with the help of Set collection,new string is :"  + duplicate1);
            System.out.println("-----------------------------------------------------------");

            Map<Character, Integer> baseMap = new HashMap<>( );
            char[] charArray = s.toCharArray( );

            for (Character ch : charArray) {
                {
                    if (baseMap.containsKey(ch)) {
                        baseMap.put(ch, baseMap.get(ch) + 1);
                    } else {
                        baseMap.put(ch, 1);
                    }

                }
            }
        System.out.println("Occurance of each character in string is: " );

            baseMap.forEach((key, value) ->
            {
                System.out.print(key);
                System.out.print(value);
                System.out.println("\n" );
            });
        }
    }

