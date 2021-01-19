package practiceCode;

import java.util.LinkedList;

public class linkedListPalindrome {

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
