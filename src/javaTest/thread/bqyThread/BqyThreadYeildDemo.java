package javaTest.thread.bqyThread;

class ThreadYeild implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i < 5;i++){
            System.out.println(Thread.currentThread().getName() + "运行，i=" + i);
            if(i == 3){
                System.out.println("线程礼让");
                Thread.currentThread();
                Thread.yield();
            }
        }
    }
}

public class BqyThreadYeildDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadYeild(),"线程A");
        Thread thread2 = new Thread(new ThreadYeild(),"线程B");
        thread1.start();
        thread2.start();
    }
}
