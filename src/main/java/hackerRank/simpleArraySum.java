package hackerRank;

public class simpleArraySum {
    public static void main(String[] args) {
        Integer [] array = {1,2,3,4,10,11};
        int count = 0;
        for(int i =0; i<array.length;i++) {
            count = count +array[i];
        }
         System.out.println(count);
    }
}
