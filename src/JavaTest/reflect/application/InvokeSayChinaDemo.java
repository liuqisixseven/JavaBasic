package JavaTest.reflect.application;

import java.lang.reflect.Method;

/**
 * 调用Person类中的sayChina()方法
 * @author w-liuqi
 *
 */
public class InvokeSayChinaDemo {
	public static void main(String[] args) {
		Class<?> class1 = null;					//声明Class对象
		try {
			class1 = Class.forName("reflect.application.Person");   //实例化Class对象
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			Method method = class1.getMethod("sayChina");   //此方法没有参数
			method.invoke(class1.newInstance());			//调用方法，必须传递对象实例
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
