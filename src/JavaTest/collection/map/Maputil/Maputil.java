package JavaTest.collection.map.Maputil;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maputil {
	/**
	 * 输出key
	 * @param map
	 */
	public void OutputKey(Map<String, String> map) {
		//输出key
		System.out.println("输出key");
		Set<String> keys=map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String Str = iter.next();
			System.out.println(Str);
		}
	}
	/**
	 * 输出value
	 * @param map
	 */
	public void OutputValue(Map<String, String> map) {
		//输出value
		System.out.println("输出value");
		Collection<String> values = map.values();
		Iterator<String> value = values.iterator();
		while(value.hasNext()) {
			String str = value.next();
			System.out.println(str);
		}
	}
	/**
	 * Iterator输出Map
	 * @param map
	 */
	public void IteratorOut(Map<String, String> map) {
		//Iterator输出Map
		System.out.println("Iterator输出Map");
		Set<Map.Entry<String, String>> allSet =  map.entrySet();
		Iterator<Map.Entry<String,String>> it = allSet.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			System.out.println(me.getKey()+"->"+me.getValue());
		}
	}
	/**
	 * foreach输出Map
	 * @param map
	 */
	public void ForeachOut(Map<String, String> map) {
		//foreach输出Map
		System.out.println("foreach输出Map");
		for(Map.Entry<String, String> me :map.entrySet()) {
			System.out.println(me.getKey()+"->"+me.getValue());
		}
	}
	/**
	 * 判断指定的key是否存在
	 * @param map
	 * @param string
	 */
	public void ContainsKey(Map<String, String> map,String string) {
		if(!map.containsKey(string)) {
			System.out.println("无"+string+"-key");
		}else {
			System.out.println(string+"-key");
		}
	}
	/**
	 * 判断指定的value是否存在
	 * @param map
	 * @param string
	 */
	public void ContainsValue(Map<String, String> map,String string) {
		if(!map.containsValue(string)) {
			System.out.println("无"+string+"-value");
		}else {
			System.out.println(string+"-value");
		}
	}
}
