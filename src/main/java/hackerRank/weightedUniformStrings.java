package hackerRank;

import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class weightedUniformStrings {

    public static void main(String[] args) {
        String s = "aaabbbbcccddd";
        int[] queries = {5,9,7,8,12,5};
        String[] weightedUniformString = weightedUniformString(s, queries) ;
    }

    private static String[] weightedUniformString(String s, int[] queries) {
        int totalWeigtage = 0;
        char[] charArray = s.toCharArray();
//        for(int j =0 ; j< charArray.length-1; j++){
//            if(charArray[j] == charArray[j+1]) {
//                count = count +1;
//            }
//        }
//        System.out.println(count);
        HashMap <String, Integer> weitage = new HashMap<>();
            int i =1;
            for (char ch = 'a'; ch <= 'z'; ++ch) {
                weitage.put(String.valueOf(ch), i);
                i++;
            }
        Set<Character> targetSet = s
                .chars()
                .mapToObj(c -> (char) c).collect(Collectors.toSet());



          HashMap<Character, Integer> uniformStringCount = new HashMap<Character, Integer>();

          for(char c: charArray) {
              if(uniformStringCount.containsKey(c)){
                  uniformStringCount.put(c, uniformStringCount.get(c) +1);
              } else {
                  uniformStringCount.put(c, 1 );
              }
          }

        uniformStringCount.forEach((key, value) -> System.out.println(key + " " + value));




        return new String[0];
    }
}
