package JavaTest.collection.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * 指定排序规则
 * @author w-liuqi
 *
 */
public class TreeSetDemo02 {
	public static void main(String[] args) {
		Set<Person> allSet = new TreeSet<Person>();
		allSet.add(new Person("A", 30));
		allSet.add(new Person("B", 31));
		allSet.add(new Person("C", 32));
		allSet.add(new Person("D", 32));
		allSet.add(new Person("E", 32));
		allSet.add(new Person("F", 33));
		allSet.add(new Person("G", 33));
		System.out.println(allSet);
	}
}
class Person implements Comparable<Person>{
	private String name;
	private int age;
	@Override
	public int compareTo(Person person) {
		// TODO Auto-generated method stub
		if(this.age>person.age) {
			return 1;
		}else if (this.age<person.age) {
			return -1;
		}else {
			return this.name.compareTo(person.name);
		}
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
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
