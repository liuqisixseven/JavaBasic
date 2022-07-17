package javaTest.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BqyListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add(" ");
        list.add("World");
        ListIterator<String> iter = list.listIterator();
        System.out.println("由前向后输出：");
        while (iter.hasNext()){
            String str= iter.next();
            System.out.print(str + ",");
            iter.set("Hot-" + str);
        }
        iter.add("BQY");
        System.out.println("\n由后向前输出：");
        while (iter.hasPrevious()){
            System.out.print(iter.previous() + ",");
        }
    }
}
