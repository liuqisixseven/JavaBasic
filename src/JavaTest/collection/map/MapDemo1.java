package JavaTest.collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

import JavaTest.collection.map.Maputil.Maputil;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<String,String> hashMap = new HashMap<String,String>();
		hashMap.put("67", "-67");
		hashMap.put(null, "-6767");
		hashMap.put("676767",null);
		
		Map<String,String> hashtableMap = new Hashtable<String,String>();
		hashtableMap.put("67", "-67");
		hashtableMap.put("6767", "-6767");
		hashtableMap.put("676767","-676767");
		
		Map<String,String> treeMap = new TreeMap<String,String>();
		treeMap.put("67", "-67");
		treeMap.put("6767", "-6767");
		treeMap.put("676767","-676767");		
		
		Maputil maputil = new Maputil();
		maputil.ContainsKey(hashMap, "67");
		maputil.ContainsValue(hashMap, "676767");
		maputil.ForeachOut(hashtableMap);
		maputil.IteratorOut(hashtableMap);
		maputil.OutputKey(hashMap);
		maputil.OutputValue(hashMap);
		
	}
}
