package javaTest.reflect.factory;

public class Factory {
	public static Fruit getInstance(String className) {
		Fruit fruit = null;
		try {
			fruit = (Fruit)Class.forName(className).newInstance();   //实例化对象
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return fruit;
	}
}
