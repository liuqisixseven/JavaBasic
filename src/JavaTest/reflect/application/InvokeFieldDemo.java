package JavaTest.reflect.application;

import java.lang.reflect.Field;

public class InvokeFieldDemo {
	public static void main(String[] args) throws Exception{
		Class<?> class1 = null;
		Object object = null;
		class1 = Class.forName("reflect.application.Person");	//实例化Class对象
		object = class1.newInstance();	//实例化对象
		Field nameField = null;		//表示name属性
		Field ageField = null;		//表示age属性
		nameField = class1.getDeclaredField("name");  //取得name属性
		ageField = class1.getDeclaredField("age");		//取得age属性
		nameField.setAccessible(true);    	//将name属性设置成可被外部访问
		nameField.set(object, "刘琦");
		ageField.setAccessible(true);
		ageField.set(object, 24);
		System.out.println("姓名："+nameField.get(object));  //通过get取得属性内容
		System.out.println("年龄："+ageField.get(object));
		
	}
}
