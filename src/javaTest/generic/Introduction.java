package javaTest.generic;

/**
 * 泛型
 * 个人基本信息类
 * @author w-liuqi
 *
 */
public class Introduction implements Info{
	private String name;
	private String sex;
	private int age;
	@Override
	public String toString() {
		return "Introduction [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	public Introduction(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
