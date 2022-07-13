package javaTest.collection.properties;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * 将属性保存在XML文件中
 * @author w-liuqi
 *
 */
public class PropertiesDemo04 {
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.setProperty("BJ", "北京");
		properties.setProperty("Tj", "天津");
		properties.setProperty("NJ", "南京");
		File file = new File("d:"+File.separator+"IOTest"+File.separator+"properties.xml");
		try {
			properties.storeToXML(new FileOutputStream(file),"Area Info");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
