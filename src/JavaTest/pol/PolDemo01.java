package JavaTest.pol;

/**
 * 对象的向上转型
 * @author w-liuqi
 *
 */
public class PolDemo01{
	public static void main(String[] args) {
		B b = new B();  //定义子类实例化对象
		A a = b;   //发生了向上转型的关系，子类-->父类
		a.fun1();   //此方法被子类覆写过
	}
}
