package javaTest.thread.bqyThread;

class Man{
    public void say(){
        System.out.println("男人对女人说：你给我喝的，我给你吃的");
    }
    public void get(){
        System.out.println("男人得到了喝的");
    }
}
class Woman{
    public void say(){
        System.out.println("女人对男人说：你给我吃的，我给你喝的");
    }
    public void get(){
        System.out.println("女人得到了吃的");
    }
}
public class BqySynchronizedDemo3 implements Runnable{
    public static void main(String[] args) {
        BqySynchronizedDemo3 b1 = new BqySynchronizedDemo3();
        BqySynchronizedDemo3 b2 = new BqySynchronizedDemo3();
        b1.flag = true;
        b2.flag = false;
        Thread thread1 = new Thread(b1);
        Thread thread2 = new Thread(b2);
        thread1.start();
        thread2.start();
    }
    private static Man m = new Man();
    private static Woman w = new Woman();
    private boolean flag = false;

    @Override
    public void run() {
        if(flag){
            synchronized (m){
                m.say();
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (w){
                    m.get();
                }
            }
        }else {
            synchronized (w){
                w.say();
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (m){
                    w.get();
                }
            }
        }
    }
}
