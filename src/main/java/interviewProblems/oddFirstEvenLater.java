package interviewProblems;

import java.util.Arrays;

public class oddFirstEvenLater {

    public static void main(String[] args) {
        int number = 12345678;
        int output; //13572468

        System.out.println("Actual Number is: " + number );

        System.out.println("-------------------------------------------------------------------" );
        System.out.println("Converting int number to Int array " );
        int[] intTab = String.valueOf(number).chars().map(Character::getNumericValue).toArray();
        System.out.println("Printing the int array:  " + Arrays.toString(intTab) );
        System.out.println("-------------------------------------------------------------------" );
        oddFirstEvenlater(intTab);

    }

    private static void oddFirstEvenlater(int[] n) {
        StringBuilder strNum = new StringBuilder();
        for (int i = 0; i < n.length; i++)
        {

            strNum.append(n[i]);
            i++;
        }
        System.out.println("After adding odd occurance characters first: " + strNum );
        System.out.println("-------------------------------------------------------------------" );

        for (int i = 1; i < n.length; i++)
        {
            strNum.append(n[i]);
            i++;
        }

        System.out.println("Appending now even occurance chacracters: " + strNum );
        System.out.println("-------------------------------------------------------------------" );

        int finalInt = Integer.parseInt(strNum.toString());
        System.out.println(finalInt);

    }
}
