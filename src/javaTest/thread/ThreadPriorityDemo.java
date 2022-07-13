package javaTest.thread;

/**
 * 线程优先级
 * @author w-liuqi
 *
 */
class MyThread1 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
				// TODO: handle exception
				System.out.println(Thread.currentThread().getName()+"运行,i="+i);
		}
	}
}
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThread1(),"线程A");
		Thread thread2 = new Thread(new MyThread1(),"线程B");
		Thread thread3 = new Thread(new MyThread1(),"线程C");
		thread3.setPriority(Thread.MAX_PRIORITY);   //表示的常量  10
		thread2.setPriority(Thread.NORM_PRIORITY);  //   5
		thread1.setPriority(Thread.MIN_PRIORITY);   //   1
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
