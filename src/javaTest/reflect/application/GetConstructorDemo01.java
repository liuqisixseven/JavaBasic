package javaTest.reflect.application;

import java.lang.reflect.Constructor;

/**
 * 取得Person类中的全部构造方法
 * @author w-liuqi
 *
 */
public class GetConstructorDemo01 {
	public static void main(String[] args) {
		Class<?> class1 = null;
		try {
			class1 = Class.forName("reflect.application.Person");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Constructor<?> class2[] = class1.getConstructors();
		for (int i = 0; i < class2.length; i++) {
			System.out.println("构造方法："+class2[i]);
		}
	}
}
