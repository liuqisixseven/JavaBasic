package javaTest.collection.map;

import java.util.HashMap;
import java.util.Map;

import javaTest.collection.map.Maputil.Person;

public class HashMapDemo03 {
	public static void main(String[] args) {
		Map<Person, String> map = new HashMap<Person, String>();
		Person person = new Person("刘琦", 24);
		map.put(person, "liuqi");
		System.out.println(map.get(person));
	}
}
