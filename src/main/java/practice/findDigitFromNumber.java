package practice;

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
}
