package javaTest.date;

import java.text.DateFormat;
import java.util.Date;

/**
 * DateFormat默认操作
 * @author w-liuqi
 *
 */
public class DateFormatDemo01 {
	public static void main(String[] args) {
		DateFormat df1 = null;
		DateFormat df2 = null;
		df1 = DateFormat.getDateInstance();
		df2 = DateFormat.getDateTimeInstance();
		System.out.println("DATE:"+df1.format(new Date()));  //格式化日期
		System.out.println("DATETIME:"+df2.format(new Date()));
	}
}
