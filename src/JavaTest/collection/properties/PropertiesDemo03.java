package JavaTest.collection.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * 从属性文件中读取内容
 * @author w-liuqi
 *
 */
public class PropertiesDemo03 {
	public static void main(String[] args) {
		Properties properties = new Properties();
		File file = new File("d:"+File.separator+"IOTest"+File.separator+"properties.properties");
		try {
			properties.load(new FileInputStream(file));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("BJ属性值存在，内容是："+properties.getProperty("BJ"));
	}
}
