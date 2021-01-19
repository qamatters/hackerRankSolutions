package hackerRank.Easy;

import java.sql.SQLOutput;

public class stairCase {

    public static void main(String[] args) {
        int size = 6;
        printStairCase(size);
    }

    private static void printStairCase(int size) {
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size-j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
