package java8.suplier;

import java.util.function.Supplier;

public class randomeName {
    public static void main(String[] args) {
        Supplier<String> s = () -> {
            String s1[] = {"A", "B", "C", "D"};
            int x = (int) (Math.random()*5);
            return s1[x];
        };

        System.out.println(s.get());
        System.out.println(s.get());
    }
}
