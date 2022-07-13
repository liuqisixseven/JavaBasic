package javaTest.comparable;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private float score;
	public Student(String name, int age, float score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	
	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		if(this.score>student.score) {
			return -1;
		}else if(this.score<student.score) {
			return 1;
		}else {
			if(this.age>student.age) {
				return 1;
			}else if(this.age<student.age) {
				return -1;
			}else {
				return 0;
			}
		}
	}
}
