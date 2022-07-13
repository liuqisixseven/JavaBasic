package javaTest.reflect.application;

import java.lang.reflect.Method;

/**
 * 调用setter及getter方法
 * @author w-liuqi
 *
 */
public class InvokeSetGetDemo {
	public static void main(String[] args) {
		Class<?> class1 = null;
		Object object = null;
		try {
			class1 = Class.forName("reflect.application.Person");	//实例化Class对象
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			object = class1.newInstance();      //实例化操作对象
		} catch (InstantiationException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IllegalAccessException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		setter(object,"name","刘琦",String.class);    //调用setter方法
		setter(object,"age",24,int.class);
		System.out.print("姓名：");
		getter(object,"name");				//调用getter方法
		System.out.print("年龄：");
		getter(object,"age");
	}

	private static void getter(Object object, String string) {
		// TODO Auto-generated method stub
		try {
			Method method = object.getClass().getMethod("get"+initStr(string));  //设置方法参数类型
			System.out.print(method.invoke(object));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @param object  操作的对象
	 * @param string   操作的属性
	 * @param object2   设置的值
	 * @param class1	参数的类型
	 */
	private static void setter(Object object, String string, Object object2, Class<?> class1) {
		// TODO Auto-generated method stub
		try {
			Method method = object.getClass().getMethod("set"+initStr(string),class1);  //设置方法参数类型
			method.invoke(object, object2);    //调用方法
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private static String initStr(String string) {
		// TODO Auto-generated method stub
		String string2 = string.substring(0,1).toUpperCase()+string.substring(1);
		return string2;
	}
}
