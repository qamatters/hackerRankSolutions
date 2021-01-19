package java8.suplier;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;

public class dateTimeYearAsARandomValue {
    public static void main(String[] args) {
        //Create a random number depicting current date time in MMDDYYYYHHMMSS format
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("MMddYYYYhhmmss");
        Supplier<String> s = ()-> simpleDateFormat.format(new Date());
        System.out.println(s.get());
    }
}
