package JavaTest.collection.properties;

import java.util.Properties;

/**
 * 设置和取得属性
 * @author w-liuqi
 *
 */
public class PropertiesDemo01 {
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.setProperty("BJ", "北京");
		properties.setProperty("Tj", "天津");
		properties.setProperty("NJ", "南京");
		System.out.println("1.BJ属性存在："+properties.getProperty("BJ"));
		System.out.println("2.SC属性不存在："+properties.getProperty("SC"));
		System.out.println("2.SC属性不存在："+properties.getProperty("SC","没有发现"));
	}
}
