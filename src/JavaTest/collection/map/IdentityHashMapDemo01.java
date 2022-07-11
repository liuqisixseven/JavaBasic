package JavaTest.collection.map;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import JavaTest.collection.map.Maputil.Person;

public class IdentityHashMapDemo01 {
	public static void main(String[] args) {
		Map<Person, String> map = new IdentityHashMap<Person,String>();
		map.put(new Person("刘琦", 24), "liuqi_1");
		map.put(new Person("刘琦", 24), "liuqi_2");
		map.put(new Person("刘备", 99), "liubei");
		Set<Map.Entry<Person, String>> allSet = map.entrySet();
		
		Iterator<Map.Entry<Person, String>> iterator = allSet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Person, String> me = iterator.next();
			System.out.println(me.getKey()+"->>"+me.getValue());
		}
	}
}
