package JavaTest.pol;

public class A {
	public void fun1() {
		System.out.println("A-->pulbic void fun1(){}");
	}
	public void fun2() {
		this.fun1();
	}
}