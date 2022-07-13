package javaTest.collection.list.vector;

import java.util.Vector;

/**
 * Vector增加
 * @author w-liuqi
 *
 */
public class VectorDemo01 {
	public static void main(String[] args) {
		Vector<String> allList = new Vector<String>();
		allList.add("Hello");
		allList.add(0,"World");
		allList.add("JAVA");
		allList.addElement("www.liuqi.com");   //此方法为Vector自己定义
		System.out.println(allList);
		for (int i = 0; i < allList.size(); i++) {
			System.out.print(allList.get(i)+"、");
		}
	}
}
