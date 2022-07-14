package javaTest.thread.bqyThread;

class Synchronized2 implements Runnable{
    int rice = 5;
    @Override
    public void run() {
        for (int i = 0;i < 100;i++){
            this.eat();
        }
    }
    private synchronized void eat(){
        if (rice > 0) {
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                e.printStackTrace();
            }
            rice--;
            System.out.println(Thread.currentThread().getName() + "吃了一碗饭,还剩" + rice);
        }
    }
}
public class BqySynchronizedDemo2 {
    public static void main(String[] args) {
        Synchronized2 synchronized2 = new Synchronized2();
        Thread thread1 = new Thread(synchronized2,"线程A");
        Thread thread2 = new Thread(synchronized2,"线程B");
        Thread thread3 = new Thread(synchronized2,"线程C");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
