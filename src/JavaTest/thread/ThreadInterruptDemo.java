package JavaTest.thread;

/**
 * 线程的终止
 * @author w-liuqi
 *
 */
class MyThread implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("1.进入run方法");
		try {
			Thread.sleep(10000);
			System.out.println("2.已经完成休眠");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("3.休眠被终止");
			return;
		}
		System.out.println("4.run方法正常结束");
	}
}
public class ThreadInterruptDemo{
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread,"线程");
		thread.start();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		thread.interrupt();
	}
}
