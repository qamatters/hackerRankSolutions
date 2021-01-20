package practice;

import java.util.Stack;

public class reverseStringWithStack {
    public static void main(String[] args) {

        String s = "test123";
        char[] ch = s.toCharArray( );

        Stack<Character> stack = new Stack<Character>( );

        for (int i = 0; i <= s.length( ) - 1; i++) {
            stack.push(ch[i]);
        }
        for (int i = 0; i <= s.length( ) - 1; i++) {
            System.out.print(stack.pop( ));
        }

    }
}
