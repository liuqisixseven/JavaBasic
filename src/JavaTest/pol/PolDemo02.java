package JavaTest.pol;

/**
 * 对象的向下转型
 * @author w-liuqi
 *
 */
public class PolDemo02 {
	public static void main(String[] args) {
		A a = new B();   //发生了向上转型的关系，子类->>父类
		B b = (B)a;		//此时发生了向下转型关系
		b.fun1();		//调用方法被覆写的方法
		b.fun2();		//调用父类的方法
		b.fun3();		//调用子类自己定义的方法 
	}
}
