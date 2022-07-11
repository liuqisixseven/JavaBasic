package JavaTest.templateDesign;

public class TemplateDesign {
	public static void main(String[] args) {
		Person per1 = new Student("张三", 20, 99.0f);
		Person per2 = new Worker("李四", 30, 5000.0f);
		per1.say();
		per2.say();
	}
}
