package JavaTest.nolnner;

/**
 * 匿名内部类
 * @author w-liuqi
 *
 */
interface A{
	public void printInfo();
}
class X{
	public void fun1() {
		this.fun2(new A() {
			@Override
			public void printInfo() {
				// TODO Auto-generated method stub
				System.out.println("Hello World!!");
			}
		});
	}
	public void fun2(A a) {
		a.printInfo();
	}
}
public class NolnnerClassDemo {
	public static void main(String[] args) {
		new X().fun1();
	}
}
