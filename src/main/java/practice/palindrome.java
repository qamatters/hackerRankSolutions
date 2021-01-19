package practice;

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
}
