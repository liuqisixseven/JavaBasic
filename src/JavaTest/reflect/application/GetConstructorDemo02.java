package JavaTest.reflect.application;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * 取得一个类的全部构造方法
 * @author w-liuqi
 *
 */
public class GetConstructorDemo02 {
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
			Class<?> pClass[] = class2[i].getParameterTypes();  //列出构造中的参数类型
			System.out.print("构造方法：");
			System.out.print(Modifier.toString(class2[i].getModifiers())+" ");  //取出权限  使用modifier类完成还原修饰符
			System.out.print(class2[i].getName());    //输出构造中的参数类型
			System.out.print("(");
			for(int j=0;j<pClass.length;j++) {
				System.out.print(pClass[j].getName()+"arg"+i);   //打印参数类型
				if(j<pClass.length-1) {
					System.out.print(",");
				}
			}
			System.out.println("){}");
		}
	}
}
