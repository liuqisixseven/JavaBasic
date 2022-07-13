package javaTest.collection.map.Maputil;


public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj) {
			return true;
		}
		if(!(obj instanceof Person)) {
			return false;
		}
		Person p =(Person)obj;
		if(this.name.equals(p.name)&&this.age==p.age) {
			return true;
		}else {
			return false;
		}
	}
	public int hashCode() {
		return this.name.hashCode()*this.age;
	}
}
