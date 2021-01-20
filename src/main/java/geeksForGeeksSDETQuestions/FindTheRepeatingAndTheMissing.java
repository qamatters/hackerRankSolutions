package geeksForGeeksSDETQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheRepeatingAndTheMissing {

    public static void main(String[] args) {
        Integer arr[] = {4, 3, 6, 2, 1, 1};

        List<Integer> list1 = Arrays.asList(arr);

        List<Integer> list2 =  new ArrayList<>();
        list2.addAll(list1);
        Collections.sort(list2);
        System.out.println("original items :" +list1 );
        System.out.println("After arraysSorting: " + list2 );
        List<Integer> list3 = list2.stream().distinct().collect(Collectors.toList());
        System.out.println(list3 );

//        List<Integer> list3 =  new ArrayList<>(list1.size());
//        for(int i = 1; i<= list1.size(); i++){
//            list3.add(i);
//        }
//        System.out.println("same size list with 1 to " + list1.size() + list3 );
//

    }
}
