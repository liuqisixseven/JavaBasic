package javaTest.NumberFormat;

import java.text.DecimalFormat;

/**
 * 格式化数字
 * @author w-liuqi
 *
 */
class FormatDemo{
	public void format1(String pattern,double value) {
		DecimalFormat df = new DecimalFormat(pattern);
		String str = df.format(value);
		System.out.println("使用"+pattern+"格式化数字"+value+":"+str);
	}
}
public class DecimalFormatDemo01 {
	public static void main(String[] args) {
		FormatDemo demo = new FormatDemo();
		demo.format1("###,###,###", 111222.34567);
		demo.format1("000,000,000", 11222.34567);
		demo.format1("###,###,###￥",111222.34567);
		demo.format1("000,000,000￥", 11222.34567);
		demo.format1("##.###%", 0.345678);
		demo.format1("00.###%", 0.345678);
		demo.format1("###.###\u2030", 0.345678);
	}
}
