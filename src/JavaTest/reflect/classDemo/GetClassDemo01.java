package JavaTest.reflect.classDemo;

/**
 * 实例化Class类对象
 * @author w-liuqi
 *
 */
public class GetClassDemo01 {
	public static void main(String[] args) {
		Class<?> c1 = null;
		Class<?> c2 = null;
		Class<?> c3 = null;
		try {
			c1 = Class.forName("reflect.classDemo.X");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		c2 = new X().getClass();
		c3 = X.class;
		System.out.println("类名称："+c1.getName());
		System.out.println("类名称："+c2.getName());
		System.out.println("类名称："+c3.getName());
	}
}
class X{
	
}
