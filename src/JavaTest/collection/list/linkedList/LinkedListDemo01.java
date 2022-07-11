package JavaTest.collection.list.linkedList;

import java.util.LinkedList;

/**
 * 为链表增加数据
 * @author w-liuqi
 *
 */
public class LinkedListDemo01 {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		System.out.println("初始化链表："+linkedList);
		linkedList.addFirst("X");
		linkedList.addLast("Y");
		System.out.println("增加头和尾之后的链表："+linkedList);
	}
}
