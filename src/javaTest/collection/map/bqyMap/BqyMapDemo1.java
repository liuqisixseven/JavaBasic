package javaTest.collection.map.bqyMap;

import java.util.*;

/*
* HashMap相关操作
*/
public class BqyMapDemo1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("CSDN","www.CSDN.com");
        map.put("BQY","www.buqingyan.com");
        map.put("Java","www.Java.com");
        String v = map.get("BQY");
        System.out.println("取出的内容是：" + v);
        if (map.containsKey("CSDN")){
            System.out.println("搜索的key存在");
        }else {
            System.out.println("搜索的key不存在");
        }
        if (map.containsValue("www.Java.cn")){
            System.out.println("搜索的value存在");
        }else {
            System.out.println("搜索的value不存在");
        }
        Set<String> s = map.keySet();//输出全部的key
        Iterator<String> iter = s.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            System.out.print(str + ",");
        }
        System.out.println();
        Collection<String> coll = map.values();//输出全部的value
        Iterator<String> values = coll.iterator();
        while (values.hasNext()){
            String stri = values.next();
            System.out.print(stri + ",");
        }
    }
}
