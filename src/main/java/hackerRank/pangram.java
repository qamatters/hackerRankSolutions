package hackerRank;
import java.util.Set;
import java.util.stream.Collectors;

public class pangram {

    public static void main(String[] args) {
        String s = "We promptly judged antique ivory buckles for the prize";
        String panGramStatus =  pangramStatus(s);
        System.out.println(panGramStatus);
    }

    private static String pangramStatus(String s) {
        String pangramExist = "pangram";
        String pangramDoesNotExist = "not pangram";


        String toAllInSameCase = s.toUpperCase();
        String stringWithoutSpaces = toAllInSameCase.replaceAll("\\s+", "");
        System.out.println(stringWithoutSpaces);


        Set<Character> targetSet = stringWithoutSpaces
                .chars()
                .mapToObj(c -> (char) c).collect(Collectors.toSet());
        System.out.println(targetSet);
        System.out.println("length of unique words is " + targetSet.size());
        if(targetSet.size() == 26) {
            return pangramExist;
        } else{
            return pangramDoesNotExist;
        }

    }
}
