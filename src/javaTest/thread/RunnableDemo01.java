package javaTest.thread;

public class RunnableDemo01 {
	public static void main(String[] args) {
		MyThreadDemo01 myThread1 = new MyThreadDemo01("线程A");
		MyThreadDemo01 myThread2 = new MyThreadDemo01("线程B");
		Thread thread1 = new Thread(myThread1);
		Thread thread2 = new Thread(myThread2);
		thread1.start();
		thread2.start();
	}
}
