package JavaTest.pol;

public class InstanceofDemo {
	public static void main(String[] args) {
		A a1 = new B();
		System.out.println("A a1 = new B():"+(a1 instanceof A));
		System.out.println("A a1 = new B():"+(a1 instanceof B));
		A a2 = new A();
		System.out.println("A a2 = new A():"+(a2 instanceof A));
		System.out.println("A a2 = new A():"+(a2 instanceof B));
	}
}
