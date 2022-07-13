package javaTest.adapter.bqy;

public class ClassAdapterDemo {
    public static void main(String[] args) {
        Buqingyan buqingyan = new Buqingyan();
        buqingyan.eat();
        buqingyan.drink();
        /*
        * 以下为转义字符测试
        */
        System.out.println("——————————————————");
        System.out.print("卜庆延-->" + "斜杠R归位\r");
        System.out.println("-----------------");
        System.out.print("卜庆延-->" + "斜杠N换行\n");
        System.out.println("-----------------");
        System.out.print("卜庆延-->" + "\r斜杠R归位");
        System.out.println("\n-----------------");
        System.out.print("卜庆延-->" + "\n斜杠N换行");
        System.out.println("\n-----------------");
        System.out.print("卜庆延-->" + "\r\n斜杠R归位斜杠N换行");
        System.out.println("\n-----------------");
        System.out.print("卜庆延-->" + "\n\r斜N归位斜杠R换行");
        System.out.println("\n-----------------");
        System.out.println("\n倒退一格:" + "123456789\b");
        System.out.println("换页:" + "123456789\f");
    }
}
