package JavaTest.thread;

public class MyThreadDemo01 implements Runnable{
	private String name;
	public MyThreadDemo01(String name) {
		this.name=name;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name+"运行，i="+i);
		}
	}
}
