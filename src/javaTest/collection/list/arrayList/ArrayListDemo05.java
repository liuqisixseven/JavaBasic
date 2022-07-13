package javaTest.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试其他操作
 * @author w-liuqi
 *
 */
public class ArrayListDemo05 {
	public static void main(String[] args) {
		List<String> allList = new ArrayList<String>();
		System.out.println("集合操作前是否为空?"+allList.isEmpty());
		allList.add("Hello");
		allList.add(0,"World");
		allList.add("JAVA");
		allList.add("www.liuqi.com");
		System.out.println(allList.contains("JAVA")?"\"JAVA\"字符串存在！":"\"JAVA\"字符串不存在！");
		List<String> allSubList = allList.subList(0, 3);
		System.out.println(allSubList);
		System.out.print("集合截取");
		for(int i=0;i<allSubList.size();i++) {
			System.out.print(allList.get(i)+"、");
		}
		System.out.println("");
		System.out.println("JAVA字符串的位置："+allList.indexOf("JAVA"));
		System.out.println("集合操作后是否为空？"+allList.isEmpty());
	}
}
