package JavaTest.enumdemo;

import java.util.EnumMap;
import java.util.Map;

enum Color1{
	RED,GREEN,BLUE;
}
public class EnumMapDemo {
	public static void main(String[] args) {
		Map<Color1, String> descMap = null;
		descMap = new EnumMap<Color1,String>(Color1.class);
		descMap.put(Color1.RED, "红色");
		descMap.put(Color1.GREEN, "绿色");
		descMap.put(Color1.BLUE, "蓝色");
		System.out.println("===============输出全部的内容===============");
		for(Color1 c : Color1.values()) {
			System.out.println(c.name()+"-->>"+descMap.get(c));
		}
		System.out.println("===============输出全部的键值===============");
		for(Color1 c : descMap.keySet()) {
			System.out.print(c.name()+"、");
		}
		System.out.println();
		System.out.println("===============输出全部的内容===============");
		for(String s:descMap.values()) {
			System.out.print(s+"、");
		}
	}
}
