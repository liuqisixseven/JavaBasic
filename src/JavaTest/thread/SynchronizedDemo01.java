package JavaTest.thread;

/**
 * 代码块+synchronized->同步代码块
 * @author w-liuqi
 *
 */
class SynchronizedThread01 implements Runnable{
	int ticket = 5;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			synchronized(this) {
				if(ticket>0) {
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"卖票:ticket="+ticket--);
				}
			}
		}
	}
}
public class SynchronizedDemo01 {
	public static void main(String[] args) {
		SynchronizedThread01 synchronizedThread = new SynchronizedThread01();
		Thread thread1 = new Thread(synchronizedThread,"线程A");
		Thread thread2 = new Thread(synchronizedThread,"线程B");
		Thread thread3 = new Thread(synchronizedThread,"线程C");
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
