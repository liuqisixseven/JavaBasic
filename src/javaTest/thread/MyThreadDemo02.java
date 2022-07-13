package javaTest.thread;

public class MyThreadDemo02 implements Runnable{
	private int ticket=5;
	public void run() {
		for (int i = 0; i < 100; i++) {
			if(ticket>0) {
				System.out.println("卖票:ticket="+ticket--);
			}
		}
	}
}
//public class MyThreadDemo02 extends Thread{
//	private int ticket=5;
//	public void run() {
//		for (int i = 0; i < 100; i++) {
//			if(ticket>0) {
//				System.out.println("卖票:ticket="+ticket);
//				ticket--;
//			}
//		}
//	}
//}

