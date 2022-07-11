package JavaTest.reflect;

import java.lang.reflect.Constructor;

/**
 * 调用类中的有参构造
 * @author w-liuqi
 *
 */
class Person1{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + "]";
	}
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
public class InstanceDemo02 {
	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("reflect.Person1");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Person1 Person1 = null;
		Constructor<?>	 constructor[] = null;     //声明一个表示构造方法的数组
		constructor = c.getConstructors();      //通过反射取得全部构造
		try {
			Person1 = (Person1)constructor[0].newInstance("刘琦",24);   //下标为0就表示调用第一个构造方法
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(Person1);
	}
}
