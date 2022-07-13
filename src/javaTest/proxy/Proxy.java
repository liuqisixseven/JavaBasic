package javaTest.proxy;

public class Proxy implements Network{
	private Network network;
	public Proxy(Network network) {
		this.network=network;
	}
	public void check() {
		System.out.println("检查用户是否合法");
	}
	@Override
	public void browse() {
		// TODO Auto-generated method stub
		this.check();
		this.network.browse();
	}
}
