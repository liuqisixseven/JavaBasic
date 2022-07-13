package javaTest.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo01 {
	public static void main(String[] args) {
		String strDate = "2021-9-22 15:33:48.250";
		//模板1
		String pat1 = "yyyy-MM-dd HH:mm:ss.SSS";
		//模板2
		String pat2 = "yyyy年MM月dd日HH时mm分ss秒SSS毫秒";
		
		SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);
		SimpleDateFormat sdf2 = new SimpleDateFormat(pat2);
		Date d = null;
		try {
			d = sdf1.parse(strDate);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(sdf2.format(d));
	}
}
