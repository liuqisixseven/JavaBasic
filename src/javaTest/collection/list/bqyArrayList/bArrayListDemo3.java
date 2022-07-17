package javaTest.collection.list.bqyArrayList;

import java.util.ArrayList;
import java.util.List;

/*
* 输出操作
* */

public class bArrayListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("World");
        list.add(0,"Hello");
        list.add("CSDN");
        list.add("www.buqingyan.com");
        System.out.println(list);
        System.out.println("从前往后输出:");
        for (int i = 0;i < list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n从后往前输出:");
        for (int i = list.size() - 1;i >= 0;i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
