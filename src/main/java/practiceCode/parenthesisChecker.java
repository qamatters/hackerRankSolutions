package practiceCode;/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;

class parenthesisChecker {
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
