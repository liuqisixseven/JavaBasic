package javaTest.thread.bqyThread;

class PriorityThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i < 5;i++){
            try {
                Thread.sleep(500);
            } catch (Exception e){

            }
                System.out.println(Thread.currentThread().getName() + "运行，i = " + i);
        }
    }
}

public class BqyThreadPriorityDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new PriorityThread(),"线程A");
        Thread thread2 = new Thread(new PriorityThread(),"线程B");
        Thread thread3 = new Thread(new PriorityThread(),"线程C");
        thread3.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
