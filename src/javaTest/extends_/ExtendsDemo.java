package javaTest.extends_;

public class ExtendsDemo {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("liuqi");
		student.setAge(24);
		student.setSchool("hbnd");
		System.out.println("姓名："+student.getName()+"年龄："+student.getAge()+"学校："+student.getSchool());
	}
}
