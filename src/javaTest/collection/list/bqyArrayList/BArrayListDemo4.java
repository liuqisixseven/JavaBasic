package javaTest.collection.list.bqyArrayList;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/*
*将集合变为对象数组
 */

public class BArrayListDemo4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("World");
        list.add(0,"Hello");
        list.add("CSDN");
        list.add("www.buqingyan.com");
        System.out.println(list);
        String[] str = list.toArray(new String[] {});
        System.out.println("指定数组类型：");
        for (int i = 0;i < str.length;i++){
            System.out.print(str[i] + " ");
        }
        System.out.println("\n返回对象数组：");
        Object obj[] = list.toArray();
        for (int i = 0;i < obj.length;i++){
            System.out.print(obj[i] + " ");
        }
    }
}
