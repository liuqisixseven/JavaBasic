package javaTest.collection.map;

import java.util.HashMap;
import java.util.Map;

import javaTest.collection.map.Maputil.Person;

/**
 * String->Person映射
 * @author w-liuqi
 *
 */
public class HashMapDemo01 {
	public static void main(String[] args) {
		Map<String, Person> map = new HashMap<String,Person>();
		map.put("liuqi", new Person("刘琦", 24));
		System.out.println(map.get("liuqi"));
	}
}
