package java8.suplier;

import java.util.function.Supplier;

/*
Generate a password with digits in 2,4,6,8 th place
Random char at 1,3,5,7,9,
 */

public class passwordWithRules {
    public static void main(String[] args) {
        Supplier<String> password = () -> {
            StringBuilder pwd = new StringBuilder();
            Supplier<Integer> digit = () -> (int )(Math.random()*10);
            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            Supplier<Character> anyCharFromSymbols = () -> symbols.charAt((int)(Math.random()*26));
            for(int i = 0; i< 8; i++) {
                if(i%2 ==0){
                   pwd.append(digit.get());
                }
                else {
                    pwd.append(anyCharFromSymbols.get());
                }
            }
              return pwd.toString();
            };
        System.out.println(password.get());
    }

}
