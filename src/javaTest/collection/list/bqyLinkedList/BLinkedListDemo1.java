package javaTest.collection.list.bqyLinkedList;

import java.util.LinkedList;

/*
* 为链表增加数据
*/
public class BLinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        System.out.println("初始化链表：" + linkedList);
        linkedList.addFirst("S");
        linkedList.addLast("E");
        System.out.println("增加头和尾之后的链表" + linkedList);
    }
}
