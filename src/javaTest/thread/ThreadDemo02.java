package javaTest.thread;

public class ThreadDemo02 {
	public static void main(String[] args) {
//		MyThreadDemo02 myThreadDemo02 = new MyThreadDemo02();
//		new Thread(myThreadDemo02).start();
//		new Thread(myThreadDemo02).start();
//		new Thread(myThreadDemo02).start();
		MyThreadDemo02 myThreadDemo02_1 = new MyThreadDemo02();
		MyThreadDemo02 myThreadDemo02_2 = new MyThreadDemo02();
		MyThreadDemo02 myThreadDemo02_3 = new MyThreadDemo02();
		myThreadDemo02_1.start();
		myThreadDemo02_2.start();
		myThreadDemo02_3.start();
	}
}
