package practiceCode;


import java.util.ArrayList;
import java.util.Collections;

public class sort {
    public static void main(String[] args) {

        ArrayList<Double> al = new ArrayList();
        al.add((double) -150);
        al.add((double) -210);
        al.add((double) -100);
        al.add(-112.5);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
}
