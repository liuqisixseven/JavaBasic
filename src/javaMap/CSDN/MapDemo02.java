package javaMap.CSDN;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 往一个Map集合中添加若干元素。获取Map中的所有value，并使用增强for和迭代器遍历输出每个value
 */
public class MapDemo02 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("1","我们");
        hashMap.put("2","他们");
        hashMap.put("3","你们1");
        hashMap.put("4","你们2");
        hashMap.put("5","你们3");
        hashMap.put("6","你们4");


        Collection<String> values = hashMap.values();
        for (String s:values) {
            System.out.println(s);
        }
        System.out.println("增强for");
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
