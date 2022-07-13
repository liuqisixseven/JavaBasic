package javaTest.reflect.application;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 取得Person类中的属性
 * @author w-liuqi
 *
 */
public class GetFieldDemo {
	public static void main(String[] args) {
		Class<?> class1 = null;
		try {
			class1 = Class.forName("reflect.application.Person");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		{
			Field field[] = class1.getDeclaredFields();   //取得本类属性
			for (int i = 0; i < field.length; i++) {
				Class<?> rClass = field[i].getType();   //取得属性的类型
				System.out.print("本类属性：");
				System.out.print(Modifier.toString(field[i].getModifiers())+" ");  //取得属性的修饰符
				System.out.print(rClass.getName());       //输出属性类型
				System.out.print(field[i].getName());		//输出属性名称
				System.out.println(" ;");
			}
		}
		System.out.println("----------------------");
		{
			Field field[] = class1.getFields();   //取得父类公共属性
			for (int i = 0; i < field.length; i++) {
				Class<?> rClass = field[i].getType();   //取得属性的类型
				System.out.print("公共属性：");
				System.out.print(Modifier.toString(field[i].getModifiers())+" ");  //取得属性的修饰符
				System.out.print(rClass.getName());       //输出属性类型
				System.out.print(field[i].getName());		//输出属性名称
				System.out.println(" ;");
			}
		}
	}
}
