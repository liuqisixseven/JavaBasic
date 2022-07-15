package javaTest.runtime.bqyRuntime;

public class BqyRuntimeDemo {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("JVM最大内存量" + runtime.maxMemory());
        System.out.println("JVM空闲内存量" + runtime.freeMemory());
        String string = "Sur————prise！！！Mother Fucker！！！";
        System.out.println(string);
        for (int i = 0;i < 1000;i++){
            string = string + i;
        }
        System.out.println("操作string之后JVM空闲内存量：" + runtime.freeMemory());
        runtime.gc();
        System.out.println("运行垃圾回收器后JVM空闲内存量：" + runtime.freeMemory());
    }
}
