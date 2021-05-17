package hackerRank.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class CaserCipher {
    public static void main(String[] args) {
        String s = "DNFjxo?b5h*5<LWbgs6?V5{3M].1hG)pv1VWq4(!][DZ3G)riSJ.CmUj9]7Gzl?VyeJ2dIPEW4GYW*scT8(vhu9wCr]q!7eyaoy.";
        System.out.println(s.length());
        int rotation = 45;
        String s1 = encryptedPassword(s,rotation);
        System.out.println(s1);
        System.out.println(s1.length());

    }

    private static String encryptedPassword(String s, int k) {
        List<Character> myList1 = new ArrayList<>();
        List<Character> myList2 = new ArrayList<>();
        List<Character> myList3 = new ArrayList<>();
        List<Integer> myList4 = new ArrayList<>();

        List<Character> myList = new ArrayList<>();
        String specialCharcaters = "~!@#$%^&*()_+:<>?{}|\"`-=[]\\;',./";

        for(int j =0; j <10 ; j++) {
            for (int i = 0; i < 26; i++) {
                myList1.add((char) (97 + i));
            }
        }
        for(int j =0; j <10 ; j++) {
            for (int i = 0; i < 26; i++) {
                myList2.add((char) (65 + i));
            }
        }

        for(int i =0; i< specialCharcaters.length(); i++) {
            myList3.add(specialCharcaters.charAt(i));
        }

        for(int i =0; i< 10; i++) {
           myList4.add(i);
        }

        for(int i =0; i< s.length(); i++) {
            if (myList1.contains(s.charAt(i))) {
                int pos = myList1.indexOf(s.charAt(i));
                int newpos = pos+k;
                myList.add((myList1.get(newpos)));
            } else if (myList3.contains(s.charAt(i)) || myList4.contains(Character.getNumericValue(s.charAt(i))) ) {
                myList.add(s.charAt(i));
            }  else if (myList2.contains(s.charAt(i))) {
                int pos1 = myList2.indexOf(s.charAt(i));
                myList.add(myList2.get(pos1+k));
            }
        }
        String myNewString = myList.stream().map(String::valueOf).collect(Collectors.joining());
        return myNewString;
    }
}
