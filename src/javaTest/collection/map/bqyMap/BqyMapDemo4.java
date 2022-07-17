package javaTest.collection.map.bqyMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* Map输出最标准的流程
**/
public class BqyMapDemo4 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("CSDN","www.CSDN.com");
        map.put("BQY","www.buqingyan.com");
        map.put("Java","www.Java.com");
        Set<Map.Entry<String,String>> allSet = map.entrySet();//泛型为Map.Entry
        Iterator<Map.Entry<String,String>> iter = allSet.iterator();
        while (iter.hasNext()){
            Map.Entry<String,String> me = iter.next();
            System.out.println(me.getKey() + "————>" + me.getValue());
        }
        //用foreach输出
        for (Map.Entry<String,String> me1 : map.entrySet()) {
            System.out.println(me1.getKey() + "————>" + me1.getValue());
        }
    }
}
