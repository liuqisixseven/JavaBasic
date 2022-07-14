package javaTest.thread.bqyThread;

public class BqyThreadDemo2 implements Runnable{
    private String name;
    public BqyThreadDemo2(String name){this.name = name;}
    @Override
    public void run() {
        for (int i = 0;i < 10;i++)
            System.out.println(name + "运行，i=" + i);
    }
}
