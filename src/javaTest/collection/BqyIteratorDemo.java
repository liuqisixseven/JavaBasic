package javaTest.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BqyIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add(" ");
        list.add("World");
        Iterator<String> iterator = list.iterator();//输出元素
        while (iterator.hasNext()){
            System.out.print(iterator.next() + ",");
        }
        System.out.println();
        Iterator<String> iter = list.iterator();//删除元素
        while (iter.hasNext()){
            String str = iter.next();
            if(" ".equals(str)){
                iter.remove();
            }else{
                System.out.print(str + ",");
            }
        }
        System.out.println("\n删除之后的合集：" + list);
    }
}
