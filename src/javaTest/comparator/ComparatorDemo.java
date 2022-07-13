package javaTest.comparator;

public class ComparatorDemo {
	public static void main(String[] args) {
		Student student[]= {
				new Student("张三", 20),
				new Student("李四", 22),
				new Student("王五", 20),
				new Student("赵六", 20),
				new Student("孙七", 22)
		};
		java.util.Arrays.sort(student,new StudentComparator());
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}
	}
}
