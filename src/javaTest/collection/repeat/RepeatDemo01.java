package javaTest.collection.repeat;

import java.util.HashSet;
import java.util.Set;


/**
 * 重复元素的说明，去掉重复元素
 * @author w-liuqi
 *
 */
public class RepeatDemo01 {
	public static void main(String[] args) {
		Set<Person1> allSet = new HashSet<Person1>();
		allSet.add(new Person1("A", 30));
		allSet.add(new Person1("B", 31));
		allSet.add(new Person1("C", 32));
		allSet.add(new Person1("C", 32));
		allSet.add(new Person1("C", 32));
		allSet.add(new Person1("F", 33));
		allSet.add(new Person1("G", 33));
		System.out.println(allSet);
	}
}
class Person1{
	private String name;
	private int age;
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj) {
			return true;
		}
		if(!(obj instanceof Person1)) {
			return false;
		}
		Person1 p =(Person1)obj;
		if(this.name.equals(p.name)&&this.age==p.age) {
			return true;
		}else {
			return false;
		}
	}
	public int hashCode() {
		return this.name.hashCode()*this.age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
