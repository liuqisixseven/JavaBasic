package javaTest.thread;

class Zhangsan{
	public void say() {
		System.out.println("张三对李四说：“你给我画，我就把书给你”");
	}
	public void get() {
		System.out.println("张三得到画了");
	}
}
class Lisi{
	public void say() {
		System.out.println("李四对张三说：“你给我书，我就把画给你”");
	}
	public void get() {
		System.out.println("李四得到书了");
	}
}
public class SynchronizedDemo03 implements Runnable{
	public static void main(String[] args) {
		SynchronizedDemo03 t1 = new SynchronizedDemo03();
		SynchronizedDemo03 t2 = new SynchronizedDemo03();
		t1.flag=true;
		t2.flag=false;
		Thread thA = new Thread(t1);
		Thread thB = new Thread(t2);
		thA.start();
		thB.start();
	}
	
	private static Zhangsan zs = new Zhangsan();
	private static Lisi ls = new Lisi();
	private boolean flag = false;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(flag) {
			synchronized(zs) {
				zs.say();
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(ls) {
					zs.get();
				}
			}
		}else {
			synchronized(ls) {
				ls.say();
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(zs) {
					ls.get();
				}
			}
		}
	}
}