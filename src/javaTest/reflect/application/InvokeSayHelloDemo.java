package javaTest.reflect.application;

import java.lang.reflect.Method;

/**
 * 调用Person类中的sayHello()方法
 * @author w-liuqi
 *
 */
public class InvokeSayHelloDemo {
	public static void main(String[] args) {
		Class<?> class1 = null;
		try {
			class1 = Class.forName("reflect.application.Person");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			Method method = class1.getMethod("sayHello", String.class,int.class);
			String rv = null;
			rv = (String)method.invoke(class1.newInstance(), "刘琦",24);
			System.out.println(rv);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
