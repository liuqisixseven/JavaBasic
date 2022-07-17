package javaTest.collection.sortedSet.bqySortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class BSortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<String>();
        sortedSet.add("A");
        sortedSet.add("B");
        sortedSet.add("C");
        sortedSet.add("D");
        sortedSet.add("E");
        sortedSet.add("D");
        sortedSet.add("A");
        sortedSet.add("E");
        System.out.println("第一个元素：" + sortedSet.first());
        System.out.println("最后一个元素：" + sortedSet.last());
        System.out.println("headSet元素：" + sortedSet.headSet("C"));
        System.out.println("tailSet元素：" + sortedSet.tailSet("C"));
        System.out.println("subSet元素：" + sortedSet.subSet("B","D"));
    }
}
