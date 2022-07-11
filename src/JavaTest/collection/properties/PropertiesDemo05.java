package JavaTest.collection.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * 从Xml文件中读取属性
 * @author w-liuqi
 *
 */
public class PropertiesDemo05 {
	public static void main(String[] args) {
		Properties properties = new Properties();
		File file = new File("d:"+File.separator+"IOTest"+File.separator+"properties.xml");
		try {
			properties.loadFromXML(new FileInputStream(file));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("属性BJ存在："+properties.getProperty("BJ"));
	}
}
