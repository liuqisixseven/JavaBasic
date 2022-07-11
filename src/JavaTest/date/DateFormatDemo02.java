package JavaTest.date;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 指定显示的风格
 * @author w-liuqi
 *
 */
public class DateFormatDemo02 {
	public static void main(String[] args) {
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD, new Locale("zh","CN"));
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.ERA_FIELD,new Locale("zh","CN"));
		System.out.println("DATE:"+df1.format(new Date()));  //格式化日期
		System.out.println("DATETIME:"+df2.format(new Date()));
	}
}
