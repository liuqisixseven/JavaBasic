package javaTest.thread.bqyThread;

public class RunnableDemo1 {
    public static void main(String[] args) {
        BqyThreadDemo2 bqyThread1 = new BqyThreadDemo2("线程A");
        BqyThreadDemo2 bqyThread2 = new BqyThreadDemo2("线程B");
        Thread thread1 = new Thread(bqyThread1);
        Thread thread2 = new Thread(bqyThread2);
        thread1.start();
        thread2.start();
    }
}
