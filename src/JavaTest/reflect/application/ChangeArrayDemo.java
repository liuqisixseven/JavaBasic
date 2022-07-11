package JavaTest.reflect.application;

import java.lang.reflect.Array;

/**
 * 通过反射修改数组的大小
 * @author w-liuqi
 *
 */
public class ChangeArrayDemo {
	public static void main(String[] args) {
		int temp[] = {1,2,3};
		int newTemp[] = (int[])arrayinc(temp,5);  //扩大数组长度
		print(newTemp);
		System.out.println("\n-----------------------------------------------");
		String t[]= {"刘琦","JAVA","java"};
		String nt[]=(String[])arrayinc(t, 8);
		print(nt);
	}

	private static void print(Object object) {
		// TODO Auto-generated method stub
		Class<?> class1 = object.getClass();    //通过数组得到Class对象
		if(!class1.isArray()) {				//判断是否是数组
			return;
		}
		Class<?> arr = class1.getComponentType();		//取得数组的Class
		System.out.println(arr.getName()+"数组的长度是："+Array.getLength(object));
		for (int i = 0; i < Array.getLength(object); i++) {
			System.out.print(Array.get(object, i)+"、");
		}
	}

	private static Object arrayinc(Object object, int len) {
		// TODO Auto-generated method stub
		Class<?> class1 = object.getClass();	//通过数组得到Class对象
		Class<?> arrClass = class1.getComponentType();	//得到数组的Class对象
		Object newO = Array.newInstance(arrClass, len);
		int co = Array.getLength(object);
		System.arraycopy(object, 0, newO, 0, co);
		return newO;
	}
}
