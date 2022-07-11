package JavaTest.collection.list.linkedList;

import java.util.LinkedList;

/**
 * 找到链表头
 * @author w-liuqi
 *
 */
public class LinkedListDemo02 {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		System.out.println("1-1、element()方法找到表头："+linkedList.element());
		System.out.println("1-2、找完之后的链表内容："+linkedList);
		System.out.println("2-1、peek()方法找到表头："+linkedList.peek());
		System.out.println("2-2、找完之后的链表内容："+linkedList);
		System.out.println("3-1、poll()方法找到表头："+linkedList.poll());
		System.out.println("3-2、找完之后的链表内容："+linkedList);
	}
}
