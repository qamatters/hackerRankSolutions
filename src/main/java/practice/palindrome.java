package practice;

import java.util.LinkedList;
import java.util.Stack;

public class palindrome {

    public static void main(String[] args) {

        String s = "aba";

        StringBuilder original  = new StringBuilder(s);
        StringBuilder reverse = original.reverse();
        String data = reverse.toString();

        if(s.equals (data)) {
            System.out.println("its a palindrom" );
        } else {
            System.out.println("its not a palindrom" );
        }

    }

    public static class findOccurance {

        public static void main(String[] args) {

            String s =  new String("deepakmathpal");
            String s1 = new String ("deepakmathpal");
            System.out.println(s==s1);
            System.out.println(s.equals(s1));



    //        char [] charArray = s.toCharArray();
    //        int num = 12345;
    //        int [] numbArray = String.valueOf(num).



    //        char[] charArray = s.toCharArray();
    //        HashMap<Character, Integer> hmp = new HashMap<>();
    //        for(char ch: charArray) {
    //            if(hmp.containsKey(ch)) {
    //                hmp.put(ch,hmp.get(ch)+1);
    //            } else {
    //                hmp.put(ch,1);
    //            }
    //        }
    //        hmp.forEach((key, value)-> System.out.println(key + " " +value));

       }
    }

    public static class linkedListPalindrome {

        public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList();
            list.add(1);
            list.add(4);
            list.add(4);
            list.add(4);
            list.add(2);
            int i;
            boolean testResult = false;
          for(i =0;i < list.size(); i++) {
              if(list.get(i).equals(list.get(list.size()-i-1))) {
                  testResult = true;
                  System.out.println("Iteration is " +  i);
                  System.out.println("From If: " + testResult);
              } else {
                  System.out.println("Iteration is " +  i);
                  testResult = false;
                  System.out.println("From else: " + testResult);
              }
          }
            System.out.println("-----------------------------------------");
            System.out.println("Final result :" + testResult);
        }

    }

    static class parenthesisChecker {
        public static void main (String[] args) {
            String str = "(()";
            char[] charArr = str.toCharArray();
            char[] charArr1 = new char[str.length()];
            int size = charArr.length;
            System.out.println(size);
            Stack stack = new Stack();

            int i;
            boolean  testResult = true;
            for (i = 0; i < size; ++i) {
                stack.push(charArr[i]);
            }
            for (i = 0; i < size; ++i) {
                charArr1[i] = (char) stack.pop();
            }
            for(i = 0; i< size; i++) {
                if ((charArr[i] == '{' && charArr1[i] == '}') ||
                        charArr[i] == '[' && charArr1[i] == ']' ||
                        charArr[i] == '(' && charArr1[i] == ')' == true)  {
                    testResult = true;
                    break;
                } else {
                    testResult = false;
                    break;
                }
            }
            if(testResult && size% 2 ==0){
                System.out.println("balanced");
            } else {
                System.out.println("not balanced");
            }
        }
    }
}
