package JavaTest.collection.properties;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * 保存属性到普通的属性文件中
 * @author w-liuqi
 *
 */
public class PropertiesDemo02 {
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.setProperty("BJ", "北京");
		properties.setProperty("Tj", "天津");
		properties.setProperty("NJ", "南京");
		File file = new File("d:"+File.separator+"IOTest"+File.separator+"properties.properties");
		try {
			properties.store(new FileOutputStream(file),"Area Info");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
