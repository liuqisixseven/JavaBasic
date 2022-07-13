package javaTest.io.print;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 格式化输出
 * @author w-liuqi
 *
 */
public class PrintDemo02 {
	public static void main(String[] args) throws Exception{
		PrintStream ps = null;
		ps = new PrintStream(new FileOutputStream(new File("d:"+File.separator+"IOTest"+File.separator+"print.txt")));
		String name = "刘琦";
		int age = 24;
		float score = 900.234f;
		char sex = 'M';
		ps.printf("姓名：%s;   年龄：%d;   成绩：%f ;   性别：%c", name,age,score,sex);
		ps.close();
	}
}
