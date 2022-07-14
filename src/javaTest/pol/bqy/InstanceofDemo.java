package javaTest.pol.bqy;

public class InstanceofDemo {
    public static void main(String[] args) {
        Father father = new Son();
        System.out.println("你会睡觉吗？" + (father instanceof Father));
        System.out.println("你会睡觉吗？" + (father instanceof Son));
        Father father1 = new Father();
        System.out.println("你会睡觉吗？" + (father1 instanceof Father));
        System.out.println("你会睡觉吗？" + (father1 instanceof Son));
    }
}
