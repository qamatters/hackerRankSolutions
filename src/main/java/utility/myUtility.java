package utility;

import java.util.Arrays;
import java.util.stream.IntStream;

public class myUtility {

    public static void main(String[] args) {
        int number = 12345678;
        int[] intArrayFromNumber =  integerTointArray(number);
        printIntarray(intArrayFromNumber);
        int numberFromIntArray= intFromIntegerArray(intArrayFromNumber);
        System.out.println(numberFromIntArray);

        //Use Case 1 -> Reverse a number
        reverseNumber(number);

        //Use Case 2 -> putEvenAndOddTogether
        allEvenandAllOddTogether(intArrayFromNumber);



    }

    private static void allEvenandAllOddTogether(int[] intArrayFromNumber) {
        StringBuilder strNum = new StringBuilder();
        for (int i = 0; i < intArrayFromNumber.length; i++)
        {
            if(intArrayFromNumber[i]%2 == 0) {
                strNum.append(intArrayFromNumber[i]);
            }
        }
        for (int i = 0; i < intArrayFromNumber.length; i++)
        {
            if(intArrayFromNumber[i]%2 !=0) {
                strNum.append(intArrayFromNumber[i]);
            }
        }
        int finalInt = Integer.parseInt(strNum.toString());
        System.out.println(finalInt);


    }


    private static void reverseNumber(int number) {
        int [] a = integerTointArray(number);
        int size = a.length;
        int[] b = IntStream.range(0,size).map(i->a[size-i-1]).toArray();
        int reversenumber = intFromIntegerArray(b);
        System.out.println(reversenumber );

    }

    private static int intFromIntegerArray(int[] intArrayFromNumber) {
        StringBuilder strNum = new StringBuilder();
        for(int i =0; i< intArrayFromNumber.length; i++) {
            strNum.append(intArrayFromNumber[i]);
        }
        int finalInt = Integer.parseInt(strNum.toString());
        return finalInt;
    }

    private static int[] integerTointArray(int number) {
        int[] intArrayFromNumber = String.valueOf(number).chars().map(Character::getNumericValue).toArray();
        return intArrayFromNumber;
    }
    private static void printIntarray(int[] intArrayFromNumber) {
        Arrays.stream(intArrayFromNumber).forEach(System.out::println);
    }

}
