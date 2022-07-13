package javaTest.producerConsumer;

public class Producer implements Runnable{
	private Info info = null;
	public Producer(Info info) {
		this.info=info;
	}
	public void run() {
		boolean flag = false;
		for (int i = 0; i < 10; i++) {
			if(flag) {
				this.info.set("刘琦","JAVA");
				flag=false;
			}else {
				this.info.set("csdn","www.liuqi.com");
				flag=true;
			}
		}
	}
}
