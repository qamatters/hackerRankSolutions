package ss;

public class BubbleSorting {

    public static void main (String[]args){

        int unsortedArray[] = {3,1,4,5,1,66,8};
         bubbleSort(unsortedArray);
        System.out.println("Sorted array is " + unsortedArray);
    }

    private static void bubbleSort(int[] unsortedArray) {
        int length = unsortedArray.length;
        boolean sorted =true;
        do{
           for(int i= 1; i<length; i++){
               if(unsortedArray[i]< unsortedArray[i-1]){
                   swap(unsortedArray, i, i-1);
                   sorted = false;
               }

           }

        }while(!sorted);


    }

    private static void swap(int[] unsortedArray, int i, int j) {
        int temp = unsortedArray[i];
        unsortedArray[i] = unsortedArray[j];
        unsortedArray[j] = temp;

    }
}
