package practice;

import java.util.Arrays;
import java.util.Scanner;

public class findDigitFromNumber {

    public static void main(String[] args) {
        int number = 12345678;
        int output; //13572468

        int[] intTab = String.valueOf(number).chars().map(Character::getNumericValue).toArray();
//        Arrays.stream(intTab).forEach(System.out::println);

        oddFirstEvenlater(intTab);

    }

    private static void oddFirstEvenlater(int[] n) {
            StringBuilder strNum = new StringBuilder();

            for (int i = 0; i < n.length; i++)
            {
                strNum.append(n[i]);
                i++;
            }
        for (int i = 1; i < n.length; i++)
        {
            strNum.append(n[i]);
            i++;
        }

            int finalInt = Integer.parseInt(strNum.toString());
            System.out.println(finalInt);

    }

    public static class arrayRotation {
        public static void main(String[] args) {
            int arr [] = {2,3,1,4,1,3,4};
            int i;
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter rotate by - ");
            int rotateBy= sc.nextInt();

                int[] rotatedArray = rotateArray(arr, rotateBy);
                for( i =0; i< arr.length; i++) {
                    System.out.println(rotatedArray[i]);
                }
            }
        private static int[] rotateArray(int[] arr, int rotateBy) {
            int length = arr.length;
            int[] rotatedArray1 = Arrays.copyOf(arr,length);
                int i ,j;
                for( i =0; i<length-rotateBy; i++) {
                    rotatedArray1[i] =  rotatedArray1[i+rotateBy];
                }
                for( i = length-rotateBy, j=0; i< length; i++) {
                        rotatedArray1[i] = arr[j];
                        j =j+1;
                }
            return rotatedArray1;
        }
    }
}
