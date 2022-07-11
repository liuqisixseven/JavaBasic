package JavaTest.reflect.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * 属性操作类
 * @author w-liuqi
 *
 */
public class Init {
	public static Properties getProperties() {
		Properties properties = new Properties();
		File file = new File("d:"+File.separator+"IOTest"+File.separator+"fruit.properties");
		try {
			if(file.exists()) {
				properties.load(new FileInputStream(file));
			}else {
				properties.setProperty("apple", "reflect.factory.Apple");
				properties.setProperty("orange", "reflect.factory.Orange");
				properties.store(new FileOutputStream(file), "FRUIT CLASS");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return properties;
	}
}
