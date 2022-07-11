package JavaTest.collection.map;

import java.util.HashMap;
import java.util.Map;

import JavaTest.collection.map.Maputil.Person;

/**
 * Person->String映射
 * @author w-liuqi
 *
 */
public class HashMapDemo02 {
	public static void main(String[] args) {
		Map<Person, String> map = new HashMap<Person, String>();
		map.put(new Person("刘琦", 24), "liuqi");   //必须覆写equals()和hashCode()方法
		System.out.println(map.get(new Person("刘琦", 24)));
	}
}
