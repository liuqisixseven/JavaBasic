package javaTest.collection.list.bqyLinkedList;

import java.util.LinkedList;

/*
* 以FIFO（先进先出）方式取出内容
*/

public class bLinkedListDemo3 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        System.out.println("初始化链表：" + linkedList);
        System.out.println(linkedList.size());
        int s = linkedList.size();
        System.out.println("以FIFO方式输出：");
        for (int i = 0;i < s;i++){
            System.out.print(linkedList.poll() + " ");
        }
    }
}
