package javaTest.collection.map.bqyMap;

/*
* TreeMap
**/

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BqyMapDemo3 {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<String,String>();
        map.put("A.CSDN","www.CSDN.com");
        map.put("B.BQY","www.buqingyan.com");
        map.put("C.Java","www.Java.com");
        Set<String> key = map.keySet();
        Iterator<String> iter1 = key.iterator();
        while (iter1.hasNext()){
            String str1 = iter1.next();
            System.out.println(str1 + "---->" + map.get(str1));//取出key对应的value
        }
    }
}
