package javaTest.wrapper;

/**
 * 装箱及拆箱操作
 * @author w-liuqi
 *
 */
public class WrapperDemo01 {
	public static void main(String[] args) {
		int x1 = 30;        //声明一个基本数据类型
		Integer i = new Integer(x1);   //装箱：将基本数据类型变为包装类
		int temp = i.intValue();       //拆箱：将一个包装类变为基本数据类型
		System.out.println(temp);
		
		float f = 30.3f;
		Float x2 = new Float(f);
		float y = x2.floatValue();
		System.out.println(y);
	}
}
