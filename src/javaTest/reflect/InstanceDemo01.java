package javaTest.reflect;

/**
 * 通过无参构造实例化对象
 * @author w-liuqi
 *
 */
class Person{
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
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
public class InstanceDemo01 {
	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("reflect.Person");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Person person = null;
		try {
			person = (Person)c.newInstance();   //类中必须有无参构造方法
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		person.setName("刘琦");
		person.setAge(24);
		System.out.println(person);
	}
}
