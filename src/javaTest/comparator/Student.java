package javaTest.comparator;

public class Student {
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object object) {
		// TODO Auto-generated method stub
		if(this==object) {
			return true;
		}
		if(!(object instanceof Student)) {
			return false;
		}
		Student student = (Student)object;
		if(student.name.equals(this.name)&&student.age==this.age) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
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
	
}
