package javaTest.io.print;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 使用PrintStream输出
 * @author w-liuqi
 *
 */
public class PrintDemo01 {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream ps = null;
		ps = new PrintStream(new FileOutputStream(new File("d:"+File.separator+"IOTest"+File.separator+"print.txt")));
		ps.print("hello");
		ps.println("World!!!");
		ps.print("1+1="+2);
		ps.close();
	}
}
