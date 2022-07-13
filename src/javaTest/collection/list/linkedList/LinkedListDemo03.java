package javaTest.collection.list.linkedList;

import java.util.LinkedList;

/**
 * 以FIFO方式取出内容
 * @author w-liuqi
 *
 */
public class LinkedListDemo03 {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		System.out.print("以FIFO的方式输出");
		for (int i = 0; i < linkedList.size()+2; i++) {
			System.out.print(linkedList.poll()+"、");
		}
	}
}
