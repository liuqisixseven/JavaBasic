package JavaTest.reflect.application;

/**
 * 取得Person类实现的全部接口
 * @author w-liuqi
 *
 */
public class GetInterfaceDemo {
	public static void main(String[] args) {
		Class<?> class1 = null;
		try {
			class1 = Class.forName("reflect.application.Person");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Class<?> class2[] = class1.getInterfaces();
		for(int i=0;i<class2.length;i++) {
			System.out.println("实现的接口名称："+class2[i].getName());
		}
	}
}
