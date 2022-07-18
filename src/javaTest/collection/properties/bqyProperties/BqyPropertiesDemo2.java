package javaTest.collection.properties.bqyProperties;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class BqyPropertiesDemo2 {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("BQY","buqingyan");
        pro.setProperty("LQ","67");
        pro.setProperty("BJ","beijing");
        //设置属性文件的保存路径
        File file = new File("D:" + File.separator + "IOTest" + File.separator +
                "area.properties");
        try {
            //保存属性到普通文件中，并设置注释内容
            pro.store(new FileOutputStream(file),"Area Info");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
