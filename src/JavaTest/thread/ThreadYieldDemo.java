package JavaTest.thread;

/**
 * 线程的礼让
 * @author w-liuqi
 *
 */
class ThreadYield implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"运行->>"+i);
			if(i==3) {
				System.out.print("线程礼让：");
				Thread.currentThread();
				Thread.yield();
			}
		}
	}
}
public class ThreadYieldDemo {
	public static void main(String[] args) {
		ThreadYield threadYield = new ThreadYield();
		Thread thread1 = new Thread(threadYield,"线程A");
		Thread thread2 = new Thread(threadYield,"线程B");
		thread1.start();
		thread2.start();
	}
}
