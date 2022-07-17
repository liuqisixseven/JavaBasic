package javaTest.collection;

import java.util.ArrayList;
import java.util.List;

public class BqyForeachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add(" ");
        list.add("World");
        for (String str:list) {
            System.out.print(str + ",");
        }
    }
}
