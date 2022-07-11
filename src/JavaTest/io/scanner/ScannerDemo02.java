package JavaTest.io.scanner;

import java.util.Scanner;

/**
 * 修改输入数据的分隔符
 * @author w-liuqi
 *
 */
public class ScannerDemo02 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\n");
		System.out.print("输入数据：");
		String string = scanner.next();
		System.out.println("输入的数据为："+string);
	}
}
