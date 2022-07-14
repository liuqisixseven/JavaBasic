package javaTest.thread.bqyThread;

public class ThreadDemo1 {
    public static void main(String[] args) {
//        BqyThreadDemo1 bqyThreadDemo1 = new BqyThreadDemo1();
//        new Thread(bqyThreadDemo1).start();
//        new Thread(bqyThreadDemo1).start();
//        new Thread(bqyThreadDemo1).start();
        BqyThreadDemo1 bqyThreadDemo01 = new BqyThreadDemo1();
        BqyThreadDemo1 bqyThreadDemo02 = new BqyThreadDemo1();
        BqyThreadDemo1 bqyThreadDemo03 = new BqyThreadDemo1();
        bqyThreadDemo01.start();
        bqyThreadDemo02.start();
        bqyThreadDemo03.start();
    }
}
