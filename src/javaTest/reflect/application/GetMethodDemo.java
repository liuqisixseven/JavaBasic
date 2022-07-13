package javaTest.reflect.application;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 取得全部方法
 * @author w-liuqi
 *
 */
public class GetMethodDemo {
	public static void main(String[] args) {
		Class<?> class1 = null;
		try {
			class1 = Class.forName("reflect.application.Person");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Method method[] = class1.getMethods();   //得到全部的方法
		for(int i=0;i<method.length;i++) {
			Class<?> rClass = method[i].getReturnType();  //得到方法的返回值类型
			Class<?> pClass[] =method[i].getParameterTypes();  //得到全部的参数类型
			System.out.print(Modifier.toString(method[i].getModifiers())+" ");
			System.out.print(rClass.getName()+" ");
			System.out.print(method[i].getName());
			System.out.print("(");
			for (int x = 0; x < pClass.length; x++) {
				System.out.print(pClass[x].getName()+" "+"arg"+x);
				if (x<pClass.length-1) {
					System.out.print(",");
				}
			}
			Class<?> exClass[] = method[i].getExceptionTypes(); //得到全部的异常抛出
			if(exClass.length>0) {
				System.out.print(")throws");
			}else {
				System.out.print(")");
			}
			for (int j = 0; j < exClass.length; j++) {
				System.out.print(exClass[j].getName());
				if(j<exClass.length) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}
}
