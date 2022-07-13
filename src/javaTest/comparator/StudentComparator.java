package javaTest.comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{
	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		if(student1.equals(student2)) {
			return 0;
		}else if(student1.getAge()<student2.getAge()) {
			return 1;
		}else {
			return -1;
		}
	}
}
