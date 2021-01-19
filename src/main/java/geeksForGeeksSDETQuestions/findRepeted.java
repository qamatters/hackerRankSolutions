package geeksForGeeksSDETQuestions;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class findRepeted {

    public static void main(String[] args) {

        String s = "1111011101011111";
        List<Character> listChar = s.chars( ).mapToObj(c -> (char) c).collect(Collectors.toList( ));
        HashMap<Character, Integer> baseMap = new HashMap<>();
        int count =0;
        for(int i =0; i< s.length()-2;i++) {
                if (listChar.get(i).equals(listChar.get(i+1))) {
                    count = count + 1;
                }
                 else{
                    count = 0 ;
                }
            }
        }

}
