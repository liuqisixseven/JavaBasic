package JavaTest.io.scanner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现日期格式的数据输入
 * @author w-liuqi
 *
 */
public class ScannerDemo04 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("输入日期(yyyy-MM-dd)：");
		String string =null;
		Date date = null;
		if(scanner.hasNext("^\\d{4}-\\d{2}-\\d{2}$")) {     //判断输入的是否为日期
			string = scanner.next("^\\d{4}-\\d{2}-\\d{2}$");
			try {
				date = new SimpleDateFormat("yyyy-MM-dd").parse(string);
			} catch (ParseException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}else {
			System.out.println("输入的日期格式错误");
		}
		System.out.println(date);
	}
}
