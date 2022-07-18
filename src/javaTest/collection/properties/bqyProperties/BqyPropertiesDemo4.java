package javaTest.collection.properties.bqyProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class BqyPropertiesDemo4 {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("BQY","buqingyan");
        pro.setProperty("LQ","67");
        pro.setProperty("BJ","beijing");
        //设置属性文件的保存路径
        File file = new File("D:" + File.separator + "IOTest" + File.separator +
                "area.xml");
        try {
            pro.storeToXML(new FileOutputStream(file),"Area info");
        } catch (Exception e){
            e.printStackTrace();
        }
        Properties pro1 = new Properties();
        try {
            pro1.loadFromXML(new FileInputStream(file));
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("从XML读取到BQY的值：" + pro1.getProperty("BQY"));
    }
}
