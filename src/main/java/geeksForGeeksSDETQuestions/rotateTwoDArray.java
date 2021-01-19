package geeksForGeeksSDETQuestions;

public class rotateTwoDArray {

    public static void main(String[] args) {
        int [][] arr = {{1,2}, {3,4}};
        int size = arr.length;

        int[][] rotated = new int[size][size];
        System.out.println("Before rotation:" );
        for(int i = 0; i< size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j]+ " ");

            }
            System.out.println( );
        }
        System.out.println("After rotation:" );
        for(int i = 0; i< size; i++) {
            for (int j =0; j< size; j++) {
                rotated[i][j] = arr[size - j - 1][i];
                System.out.print(rotated[i][j] + " " );
            }
           System.out.println( );
        }

    }
}
