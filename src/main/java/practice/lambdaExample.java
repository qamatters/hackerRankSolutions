package practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class lambdaExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,4,5,6 );
        Consumer<Integer> method = (n) -> System.out.println((n*n));
        numbers.forEach(method);
    }
}
