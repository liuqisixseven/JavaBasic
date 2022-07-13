package javaTest.io.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 读取test.txt文件
 * @author w-liuqi
 *
 */
public class ScannerDemo05 {
	public static void main(String[] args) {
		File file = new File("d:"+File.separator+"IOTest"+File.separator+"test1.txt");
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		StringBuffer stringBuffer = new StringBuffer();
		while (scanner.hasNext()) {
			stringBuffer.append(scanner.next()).append("\n");
		}
		System.out.println(stringBuffer);
	}
}
