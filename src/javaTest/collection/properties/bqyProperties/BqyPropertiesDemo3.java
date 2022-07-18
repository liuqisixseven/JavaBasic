package javaTest.collection.properties.bqyProperties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BqyPropertiesDemo3 {
    public static void main(String[] args) {
        Properties pro = new Properties();
        File file = new File("D:" + File.separator + "IOTest" + File.separator +
                "area.properties");
        try {
            pro.load(new FileInputStream(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("BQY属性值存在:" + pro.getProperty("BQY"));
    }
}
