package practice;

public class removeDigit {
    public static void main(String[] args) {
        String s1 = "India is my country 123";
        String s2 = s1.replaceAll("\\d", "");
        System.out.println("after replcaement :" + s2);
    }
}
