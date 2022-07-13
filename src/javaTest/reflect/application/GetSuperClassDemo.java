package javaTest.reflect.application;

/**
 * 取得Person的父类
 * @author w-liuqi
 *
 */
public class GetSuperClassDemo {
	public static void main(String[] args) {
		Class<?> class1 = null;
		try {
			class1 = Class.forName("reflect.application.Person");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Class<?> class2 = class1.getSuperclass();
		System.out.println("父类名称："+class2.getName());
	}
}
