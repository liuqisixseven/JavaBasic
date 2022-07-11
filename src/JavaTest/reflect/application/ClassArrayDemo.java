package JavaTest.reflect.application;

import java.lang.reflect.Array;
/**
 * 通过反射操作数组
 * @author w-liuqi
 *
 */
public class ClassArrayDemo {
	public static void main(String[] args) throws Exception{
		int temp[] = {1,2,3};
		Class<?> class1 = temp.getClass().getComponentType();  //取得数组的Class对象
		System.out.println("类型："+class1.getName());  		//得到数组类型名称
		System.out.println("长度："+Array.getLength(temp));   //得到数组长度
		System.out.println("第一个内容："+Array.get(temp, 0));
		Array.set(temp, 0, 6);
		System.out.println("第一个内容："+Array.get(temp,0));
	}
}
