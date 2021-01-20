package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterDemo {

    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10,5,10,15,20,25);
        List<Integer> l2 = al.stream().filter(i->i%2 ==0).collect(Collectors.toList());
        System.out.println("All even numbers " +l2);
        System.out.println("---------------------------------------------------------");

        List<Integer> l3 = al.stream().filter(i->i%2 !=0).collect(Collectors.toList());
        System.out.println("All odd numbers " +l3);
        System.out.println("---------------------------------------------------------");

    }
}
