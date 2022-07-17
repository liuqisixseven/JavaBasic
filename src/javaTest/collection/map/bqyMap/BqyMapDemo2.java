package javaTest.collection.map.bqyMap;

import java.util.*;

/*
* Hashtable相关操作
*/
public class BqyMapDemo2 {
    public static void main(String[] args) {
        Map<String,String> map = new Hashtable<>();
        map.put("CSDN","www.CSDN.com");
        map.put("BQY","www.buqingyan.com");
        map.put("Java","www.Java.com");
        Set<String> key = map.keySet();//得到全部的key
        Iterator<String> iter1 = key.iterator();//实例化
        while (iter1.hasNext()){
            String str1 = iter1.next();
            System.out.print(str1 + ",");
        }
        System.out.println();
        Collection<String> value = map.values();//得到全部的value
        Iterator<String> iter2 = value.iterator();//实例化
        while (iter2.hasNext()){
            String str2 = iter2.next();
            System.out.print(str2 + ",");
        }
    }
}
