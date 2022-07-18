package javaTest.collection.properties.bqyProperties;

import java.util.Properties;

public class BqyPropertiesDemo1 {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("BQY","buqingyan");
        pro.setProperty("LQ","67");
        pro.setProperty("BJ","beijing");
        System.out.println("1.BQY属性存在：" + pro.getProperty("BQY"));
        System.out.println("2.BQ属性不存在：" + pro.getProperty("BQ"));
        System.out.println("3.BQ属性存在，同时设置显示的默认值：" +
                pro.getProperty("BQ","没有发现"));
    }
}
