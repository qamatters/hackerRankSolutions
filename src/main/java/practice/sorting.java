package practice;

import java.util.Arrays;
import java.util.Comparator;

public class sorting {

    public static void main(String[] args) {

        int [] array1 = {1,2,3,42,1,2,8,9};
        String [] array2 = {"B", "C", "A"};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1) );

        Arrays.sort(array2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(array2) );
    }
}
