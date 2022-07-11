package JavaTest.reflect.factory;

public class FactoryDemo01 {
	public static void main(String[] args) {
		Fruit fruit = Factory.getInstance("reflect.factory.Apple");
		if(fruit!=null) {			//判断是否取得接口实例
			fruit.eat();
		}
	}
}
