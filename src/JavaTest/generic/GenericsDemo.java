package JavaTest.generic;

public class GenericsDemo {
	public static void main(String[] args) {
		Person<Contact> per = null;
		per = new Person<Contact>(new Contact("北京市", "111111111", "22222"));
		System.out.println(per);
		
		Person<Introduction> per1 = null;
		per1 = new Person<Introduction>(new Introduction("刘琦", "男", 24));
		System.out.println(per1);
	}
}
