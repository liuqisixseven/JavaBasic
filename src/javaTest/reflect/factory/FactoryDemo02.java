package javaTest.reflect.factory;

import java.util.Properties;

public class FactoryDemo02 {
	public static void main(String[] args) {
		Properties properties = Init.getProperties();		//初始化属性类
		Fruit fruit = Factory.getInstance(properties.getProperty("apple"));
		if(fruit!=null) {			//判断是否取得接口实例
			fruit.eat();
		}
	}
}
