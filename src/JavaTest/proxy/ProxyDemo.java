package JavaTest.proxy;

public class ProxyDemo {
	public static void main(String[] args) {
		Network net = new Proxy(new Real());
		net.browse();
	}
}
