package JavaTest.thread;

/**
 * synchronized+方法-->同步方法
 * @author w-liuqi
 *
 */
class SynchronizedThread02 implements Runnable{
	private int ticket = 5;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			this.sale();
		}
	}
	private synchronized void sale() {
		// TODO Auto-generated method stub
		if(ticket>0) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("卖票:ticket="+ticket--);
		}
	}
}
public class SynchronizedDemo02 {
	public static void main(String[] args) {
		SynchronizedThread02 synchronizedThread02 = new SynchronizedThread02();
		Thread thread1 = new Thread(synchronizedThread02);
		Thread thread2 = new Thread(synchronizedThread02);
		Thread thread3 = new Thread(synchronizedThread02);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
