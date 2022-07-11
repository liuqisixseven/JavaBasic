package JavaTest.NumberFormat;

import java.text.NumberFormat;

/**
 * 使用当前语言环境格式化数字
 * @author w-liuqi
 *
 */
public class NumberFormatDemo01 {
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println("格式化之后的数字："+nf.format(1000000));
		System.out.println("格式化之后的数字："+nf.format(1000.345));
	}
}
