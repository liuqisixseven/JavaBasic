package javaTest.collection.list.bqyArrayList;

/*
* 测试其他操作
*/

import java.util.ArrayList;
import java.util.List;

public class BArrayListDemo5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("World");
        list.add(0,"Hello");
        list.add("CSDN");
        list.add("www.buqingyan.com");
        System.out.println(list);
        System.out.println(list.contains("Hello")?"存在'Hello'":"不存在‘Hello’");
        List<String> subLis = list.subList(1,2);
        System.out.println("集合截取");
        for (int i = 0;i < subLis.size();i++){
            System.out.print(subLis.get(i)+ " ");
        }
        System.out.println("\n"+list);
        System.out.println();
        System.out.println("CSDN字符串的位置：" + list.indexOf("CSDN"));
        System.out.println("集合操作后是否为空？" + list.isEmpty());
    }
}
