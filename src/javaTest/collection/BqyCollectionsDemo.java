package javaTest.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BqyCollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Collections.addAll(list,"CSDN","Java","卜庆延");//为集合增加内容
        Iterator<String> iter1 = list.iterator();
        while (iter1.hasNext()){
            System.out.println(iter1.next());
        }

//        Collections.reverse(list);//反转集合中的内容
//        Iterator<String> iter2 = list.iterator();
//        while (iter2.hasNext()){
//            System.out.println(iter2.next());
//        }

        int point = Collections.binarySearch(list,"CSDN");//检索集合中的内容，返回位置
        System.out.println("检索结果：" + point);
        point = Collections.binarySearch(list,"卜庆延");
        System.out.println("检索结果：" + point);
        point = Collections.binarySearch(list,"67");//检索集合中不存在的内容
        System.out.println("检索结果：" + point);

        if(Collections.replaceAll(list,"Java","www.Java.com")){
            System.out.println("替换成功！");
        }                                           //替换集合中的内容，返回boolean
        Iterator<String> iter3 = list.iterator();
        while (iter3.hasNext()){
            System.out.println(iter3.next());
        }

        Collections.swap(list,0,2);//交换指定位置的内容
        System.out.println("交换之后的内容：");
        iter3 = list.iterator();
        while (iter3.hasNext()){
            System.out.println(iter3.next());
        }
    }
}
