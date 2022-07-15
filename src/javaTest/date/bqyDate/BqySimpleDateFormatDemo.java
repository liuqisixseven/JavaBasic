package javaTest.date.bqyDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BqySimpleDateFormatDemo {
    public static void main(String[] args) {
        String str = "2022-7-15 15:36:50:654";
        String format1 = "yyyy-MM-dd HH:mm:ss:SSS";
        String format2 = "yyyy年MM月dd日 HH时mm分ss秒SSS毫秒";

        SimpleDateFormat sdf1 = new SimpleDateFormat(format1);
        SimpleDateFormat sdf2 = new SimpleDateFormat(format2);
        Date date = null;
        try {
            date = sdf1.parse(str);
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(sdf2.format(date));
    }
}
