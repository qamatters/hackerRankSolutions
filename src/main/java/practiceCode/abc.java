package practiceCode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class abc {

    public static void main(String[] args) {
        String s = "xyz abc mnp \"asdf dsaa\" asd   \"deep mnc\"";


//        String[] out_ = abc(s).toArray(new String[0]);
//
//        System.out.println(out_);
//        for (int i_out_ = 0; i_out_ < out_.length; i_out_++)
//        {
//            System.out.println(out_[i_out_]);
//        }

    }

    private static String[] abc(String s) {
        List<String> list =new ArrayList<String>();
        Matcher m = Pattern.compile("([^\"]\\s*|\".+?\")\\s*").matcher(s);

        while(m.find()){
            list.add(m.group(1));
        }
        String[] itemsArray = new String[list.size()];
        itemsArray = list.toArray(itemsArray);

        for(String s1 : itemsArray)
            System.out.println(s1);


        return itemsArray;

    }
}
