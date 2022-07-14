package javaTest.thread.bqyThread;

class Mythead implements Runnable {
    @Override
    public void run() {
        System.out.println("1.进入了run方法");
        try {
            Thread.sleep(10000);
            System.out.println("2.完成了休眠");
        } catch (Exception e){
            System.out.println("3.休眠被终止");
            return;
        }
        System.out.println("4.run方法正常结束");
    }
}
public class BqyThreadInterruptDemo {
    public static void main(String[] args) {
        Mythead mythead = new Mythead();
        Thread thread = new Thread(mythead,"线程");
        thread.start();
        try{
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println();
        }
        thread.interrupt();
    }
}
