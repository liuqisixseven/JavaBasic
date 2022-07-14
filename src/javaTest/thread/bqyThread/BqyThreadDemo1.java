package javaTest.thread.bqyThread;

//public class BqyThreadDemo1 implements Runnable{
//    private int rice = 0;
//    public void run(){
//        for (int i = 0;i < 10;i++){
//            if (rice < 10)
//                System.out.println("已经吃了" + rice++ + "碗米饭");
//        }
//    }
//}
public class BqyThreadDemo1 extends Thread{
    private int rice = 0;
    public void run(){
        for (int i = 0;i < 100;i++){
            if (rice < 10)
                System.out.println("已经吃了" + rice++ + "碗米饭");
        }
    }
}
