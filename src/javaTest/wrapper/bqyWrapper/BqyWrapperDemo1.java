package javaTest.wrapper.bqyWrapper;

public class BqyWrapperDemo1 {
    public static void main(String[] args) {
        int a = 10;
        Integer i = new Integer(a);//装箱，将基本数据类型变为包装类
        int b = i.intValue();//拆箱，将包装类变为基本数据类型
        System.out.println(b);

        double c = 20.222d;
        Double d = new Double(c);
        double e = d;
        System.out.println(d);
        double f = d.doubleValue();
        System.out.println(f);
    }
}
