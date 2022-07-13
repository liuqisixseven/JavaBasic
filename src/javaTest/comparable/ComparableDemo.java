package javaTest.comparable;

public class ComparableDemo {
	public static void main(String[] args) {
		Student student[]= {
				new Student("张三", 20, 90.0f),
				new Student("李四", 22, 90.0f),
				new Student("王五", 20, 99.0f),
				new Student("赵六", 20, 70.0f),
				new Student("孙七", 22, 100.0f)
		};
		java.util.Arrays.sort(student);
		for(int i=0;i<student.length;i++) {
			System.out.println(student[i]);
		}
	}
}
