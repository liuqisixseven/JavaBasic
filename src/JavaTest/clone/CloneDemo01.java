package JavaTest.clone;

/**
 * 对象的克隆操作
 * @author w-liuqi
 *
 */
public class CloneDemo01 {
	public static void main(String[] args) throws Exception {
		Person p1 = new Person("刘琦");
		Person p2 = (Person) p1.clone();
		p2.setName("李四");
		System.out.println("原始对象："+p1);
		System.out.println("克隆之后的对象："+p2);
	}
}

