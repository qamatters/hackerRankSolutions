package practice;


import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static practice.pattern.fileReadingFromTextFile.fileRead;

public class findDuplicate {

    public static void main(String[] args) {
        String s = "India is my country 123";
        String s1 = "India is my country 123";
        String s2 = s1.replaceAll("\\d", "");


        System.out.println("after replcaement :" + s2);
        List<Integer> ar = Arrays.asList(1, 2, 3, 4, 5, 1, 3, 6, 7);
        HashSet<Integer> unique = new HashSet<>(ar);
        System.out.println("unique are " + unique);

        HashSet<Integer> duplicates1 = new HashSet<>( );
        for (int i = 0; i < ar.size( ); i++) {

            if (duplicates1.add(ar.get(i)) == false) {
                System.out.println("duplicates are " + ar.get(i));
            }
        }

        System.out.println(" duplicates :" + duplicates1);
        List<Integer> list1 = ar.stream( ).distinct( ).collect(Collectors.toList( ));
        System.out.println(list1);

        Set<Integer> set1 = ar.stream( ).collect(Collectors.toSet( ));
        System.out.println(set1);

        String distinctChar = s.chars( ).mapToObj(c -> (char) c).collect(Collectors.toSet( )).stream( ).map(String::valueOf).collect(Collectors.joining( ));
        System.out.println(distinctChar);

        Set<Character> duplicate1 = s.chars( ).mapToObj(c -> (char) c).collect(Collectors.toSet( ));
        System.out.println(duplicate1);

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
        Set keys = baseMap.keySet( );
        System.out.println(keys);

        baseMap.forEach((key, value) ->
        {
            System.out.println(key);
            System.out.println(value);
        });


    }

    public static class sort {
        public static void main(String[] args) {

            ArrayList<Double> al = new ArrayList();
            al.add((double) -150);
            al.add((double) -210);
            al.add((double) -100);
            al.add(-112.5);
            System.out.println(al);
            Collections.sort(al);
            System.out.println(al);
        }
    }

    public static class coundWords {
        public static void main(String[] args) throws IOException {
            String filePath = "src//sample.txt";
            String searchedData = "Linux";
            String data =   fileRead(filePath);
            System.out.println(data);
         int count = utility.allStringCommonOperations.count(searchedData, data);
         System.out.println("occurrence of word is " + count);
        }

    }
}
