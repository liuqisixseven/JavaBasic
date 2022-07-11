package JavaTest.io.scanner;

import java.util.Scanner;

/**
 * 基本的数据输入
 * @author w-liuqi
 *
 */
public class ScannerDemo01 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("输入数据：");
		String string = scanner.next();
		System.out.println("输入的数据为:"+string);
	}
}
