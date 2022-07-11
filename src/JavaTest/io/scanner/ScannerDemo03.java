package JavaTest.io.scanner;

import java.util.Scanner;

/**
 * 输入int，float
 * @author w-liuqi
 *
 */
public class ScannerDemo03 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		float f = 0.0f;
		System.out.print("输入整数：");
		if(scanner.hasNextInt()) {				//判断输入的是否是整数
			i=scanner.nextInt();
			System.out.println("整数数据："+i);
		}else {
			System.out.println("输入的不是整数");
		}
		
		System.out.print("输入小数：");
		if(scanner.hasNextFloat()) {
			f = scanner.nextFloat();
			System.out.println("小数数据："+f);
		}else {
			System.out.println("输入的不是小数");
		}
	}
}
