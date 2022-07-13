package javaTest.collection.sortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 验证SortedSet接口
 * @author w-liuqi
 *
 */
public class SortedSetDemo01 {
	public static void main(String[] args) {
		SortedSet<String> allSet = new TreeSet<String>();
		allSet.add("A");
		allSet.add("B");
		allSet.add("C");
		allSet.add("C");
		allSet.add("C");
		allSet.add("D");
		allSet.add("E");
		System.out.println("第一个元素："+allSet.first());
		System.out.println("最后一个元素："+allSet.last());
		System.out.println("headSet元素："+allSet.headSet("C"));     //返回从开始到指定元素的集合
		System.out.println("tailSet元素："+allSet.tailSet("C"));    //从指定元素到最后
		System.out.println("subSet元素："+allSet.subSet("B", "D"));  //返回指定对象间的元素
	}
}
