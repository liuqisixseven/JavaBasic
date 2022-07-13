package javaTest.reflect.dynaproxy;

public class RealSubject implements Subject{
	@Override
	public String say(String name, int age) {
		// TODO Auto-generated method stub
		return "姓名： "+name+",年龄： "+age;
	}
}
