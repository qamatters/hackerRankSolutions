package practiceCode;

import java.util.Arrays;
import java.util.Scanner;

public class arrayRotation {
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
