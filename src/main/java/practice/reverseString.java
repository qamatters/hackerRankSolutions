package practice;

import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {

        String s = "test123";
        char[] ch = s.toCharArray( );

        for(int i = ch.length; i<0; i--) {
            System.out.println(ch[i] );
        }

        Stack<Character> stack = new Stack<Character>( );

        for (int i = 0; i <= s.length( ) - 1; i++) {
            stack.push(ch[i]);
        }

        for (int i = 0; i <= s.length( ) - 1; i++) {
            System.out.println(stack.pop( ));

        }

    }
}
