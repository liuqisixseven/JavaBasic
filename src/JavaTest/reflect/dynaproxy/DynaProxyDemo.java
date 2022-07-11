package JavaTest.reflect.dynaproxy;

public class DynaProxyDemo {
	public static void main(String[] args) {
		MyInvocationHandler handler = new MyInvocationHandler();  //实例化代理操作类
		Subject subject = (Subject)handler.bind(new RealSubject());  //绑定对象
		String info = subject.say("刘琦", 24);
		System.out.println(info);
	}
}
