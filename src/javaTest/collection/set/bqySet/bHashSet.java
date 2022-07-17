package javaTest.collection.set.bqySet;

import java.util.HashSet;
import java.util.Set;

/*
* HashSet类不能加入重复元素
* */
public class bHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("C");
        set.add("C");
        set.add("D");
        set.add("D");
        set.add("E");
        System.out.println(set);
    }
}
