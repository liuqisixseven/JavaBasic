package javaTest.collection.list.bqyArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
* 增加操作
* */

public class bArrayListDemo1 {
    public static void main(String[] args) {
        List<String> list = null;
        Collection<String> collection = null;
        list = new ArrayList<String>();
        collection = new ArrayList<String>();
        list.add("Hello");
        list.add(1,"World");
        System.out.println(list);
        collection.add("BQY");
        collection.add("www.bqy.com");
        System.out.println(collection);
        list.addAll(collection);
        System.out.println(list);
        list.addAll(0,collection);
        System.out.println(list);
    }
}
