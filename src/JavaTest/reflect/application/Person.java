package JavaTest.reflect.application;

public class Person implements China{
	private String name;
	private int age;
	public Person() {
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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
	public void sayChina() {
		// TODO Auto-generated method stub
		System.out.println("姓名："+AUTHOR+",国籍："+NATIONAL);
	}
	@Override
	public String sayHello(String name, int age) {
		// TODO Auto-generated method stub
		return name+" : 你好！我几年"+age+"岁了";
	}
}
