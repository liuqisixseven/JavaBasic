package javaTest.wrapper;

/**
 * 字符串变为基本数据类型
 * @author w-liuqi
 *
 */
public class WrapperDemo03 {
	public static void main(String[] args) {
		String str1 = "30";
		String str2 = "30.3";
		int x = Integer.parseInt(str1);
		float f = Float.parseFloat(str2);
		System.out.println("整数乘方:"+x+"*"+x+"="+(x*x));
		System.out.println("小数乘方:"+f+"*"+f+"="+(f*f));
	}
}
