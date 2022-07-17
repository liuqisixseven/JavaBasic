package javaTest.collection.set.bqySet;

import java.util.Set;
import java.util.TreeSet;

/*
* TreeSet不能加入重复元素
* 自动排序
* */
public class BTreeSetDemo1 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>();
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("A");
        set.add("A");
        set.add("B");
        set.add("E");
        System.out.println(set);
    }
}
