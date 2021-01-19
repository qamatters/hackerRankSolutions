package hackerRank;

public class sample {

    public static void main(String[] args) {
//        int n = 370;
//        int total =0;
//
//         while(n !=0) {
//         int temp = n%10;
//         total = total + temp*temp*temp;
//         n = n/10;
//         }


//        System.out.println(total);

         String s = "deepak88";
         boolean b = s.matches("\\d");
        System.out.println(b);






//        String s = "deepakMathpal";
//        Set<Character> stringAsList = s.chars().mapToObj(c -> (char)c).collect(Collectors.toSet());
//        System.out.println(stringAsList);

//        String s = "Mary";
//        String s1 = "Army";
//        String sChanged = s.toLowerCase();
//        String s1Changed = s1.toLowerCase();
//        List<Character> lis1 = sChanged.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
//        Collections.sort(lis1);
//        System.out.println(lis1);
//        List<Character> lis2 = s1Changed.chars().mapToObj(c -> (char )c).collect(Collectors.toList());
//        Collections.sort(lis2);
//        System.out.println(lis2);

//        char[] charArray1 = sChanged.toCharArray();
//        char[] charArray2 = s1Changed.toCharArray();
//         Arrays.sort(charArray1);
//         Arrays.sort(charArray2);
//
//        System.out.println(charArray1);
//        System.out.println(charArray2);
//
//
//        if(String.valueOf(charArray1).equals(String.valueOf(charArray2))) {
//            System.out.println("angram");
//        } else {
//            System.out.println("not");
//        }
//
//            String s =  "dee8";
//            boolean value = s.matches(".*\\D.*");
//            System.out.println(value);

//        String s = "deepak";
//        List<Character> lis1 = s.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
//        System.out.println(lis1);
//        if(lis1.contains('e')) {
//            lis1.remove('e');
//        }
//        String s1 = lis1.stream().map(String::valueOf).collect(Collectors.joining());
//        System.out.println(s1);

//        HashMap<Character, Integer> count = new HashMap<>();
//
//        for (char ch: charArray ) {
//            if (count.containsKey(ch)) {
//                count.put(ch, count.get(ch) + 1);
//            } else {
//                count.put(ch, 1);
//            }
//        }
//        int count1 =0;
//    count.forEach((key, value) -> System.out.println(key + " " + value));
//
//
//    for(char c: charArray) {
//        switch (c) {
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//            count1++;
//            break;
//
//
//        }
//
//    }
//
//        System.out.println(count1);



//        Set<Character> stringAsAlist = s.chars().mapToObj(c -> (char)(c)).collect(Collectors.toSet());
//        System.out.println(stringAsAlist);

//        String s1 = "deepak";
//        StringBuffer s2 = new StringBuffer("mathpal");
//
//        System.out.println(s1);
//        System.out.println(s2);
//        String s3 = s1.concat(s);
//
//        System.out.println(s3);
//        System.out.println(s1);
//
//        System.out.println(s2.append(s1));
//        System.out.println(s2);

//
//       List<Integer> a = new LinkedList<>();
//       a.add(1);
//       a.add(2);
//       a.add(3);
//
//
//        System.out.println(a);
//         a.add(1,10);;
//        System.out.println(a);
//
//        List<Integer> b = new ArrayList<>();
//        b.add(1);
//        b.add(2);
//        b.add(3);
//
//        System.out.println(b);
//        b.add(1,10);
//        System.out.println(b);
//
//        Set<Integer> abc = new HashSet();
//        abc.add(1);
//        abc.add(2);
//        abc.add(1);
//        System.out.println(abc);


//        String s1 = "deepak mathpal";
//        char[] charArray = s1.toCharArray();

//        String s2 = "";
//        for(int i = charArray.length-1; i >= 0; i--) {
//            s2 = s2 + charArray[i];
//        }

//        System.out.println(s2);

//        StringBuffer reverse = new StringBuffer(s1);
//        System.out.println(reverse.reverse());


//      Stack<String> s3 = new Stack<>();
//        String ch1 = "";
//
//      for(int i =0 ; i < s1.length(); i++) {
//          s3.add(String.valueOf(s1.charAt(i)));
//      }
//
//        System.out.println(s3);
//
//      for(int i =0; i< s1.length(); i++) {
//       ch1 = ch1 + s3.pop();
//      }
//
//        System.out.println(ch1);





//        char[] ch1 = s.toCharArray();
//        HashMap<char[], Integer> hm = new HashMap<>();
//
//        for(char c1: ch1) {
//            if(hm.containsKey(c1)) {
//                hm.put(ch1, hm.get(c1)+1);
//            } else {
//                hm.put(ch1, hm.get(c1));
//            }
//        }
//

    }
}
