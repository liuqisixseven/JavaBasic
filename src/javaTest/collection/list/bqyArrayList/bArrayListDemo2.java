package javaTest.collection.list.bqyArrayList;

import java.util.ArrayList;
import java.util.List;

/*
* 删除操作
* */

public class bArrayListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("World");
        list.add(0,"Hello");
        list.add("CSDN");
        list.add("www.buqingyan.com");
        System.out.println(list);
        list.remove(1);
        list.remove("CSDN");
        System.out.println(list);
    }
}
