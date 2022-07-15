package javaTest.date.bqyDate;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class BqyDateFormatDemo2 {
    public static void main(String[] args) {
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD,new Locale("zh","CN"));
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.ERA_FIELD,new Locale("zh","CN"));
        System.out.println("Date:" + df1.format(new Date()));
        System.out.println("Date:" + df2.format(new Date()));
    }
}
