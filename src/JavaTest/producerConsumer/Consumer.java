package JavaTest.producerConsumer;

public class Consumer implements Runnable{
	private Info info = null;
	public Consumer(Info info) {
		this.info=info;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			this.info.get();
		}
	}
}
