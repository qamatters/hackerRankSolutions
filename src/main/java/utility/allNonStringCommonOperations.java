package utility;
import java.util.*;


public class allNonStringCommonOperations {

    //Array to arraylist conversion
    public static List<Integer> convertIntegerArrayToArrayList (Integer[] arr) {
        return Arrays.asList(arr);
    }

    /* utility function to print an array */
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Copying Array contents to another array
    int[] copyArray(int[]arr, int lengthOfTheArray) {
        return Arrays.copyOf(arr,lengthOfTheArray);
    }

    //Count the occurrence of a string
    public static int count(String str, String target) {
        return (str.length() - str.replace(target, "").length()) / target.length();
    }


}
