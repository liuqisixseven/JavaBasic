package JavaTest.collection;

import JavaTest.collection.util.CollectionDemoUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class CollectionsDemo {
	public static void main(String[] args) {
		CollectionDemoUtil collectionDemoUtil = new CollectionDemoUtil();
		List<String> allList = new ArrayList<String>();
		Collections.addAll(allList, "java","demo","lq");
		Iterator<String> iterator = allList.iterator();
		System.out.print("操作前集合为：");
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+"、");
		}
		int x = collectionDemoUtil.BinarySearch(allList,"lq");
		System.out.println("所在位置为:"+x);
		collectionDemoUtil.Reverse(allList);
		collectionDemoUtil.ReplaceAll(allList, "lq", "刘琦");
		collectionDemoUtil.Swap(allList, 1, 2);
		iterator = allList.iterator();
		System.out.print("操作后集合为：");
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+"、");
		}
		
		System.out.println();
		List<String> all = new ArrayList<String>();
		Collections.addAll(all, "1.java","2.liuqi","X.67");
		Collections.addAll(all,"B.www.liuqi.com");
		Collections.addAll(all,"A.www.liuqijava.com");
		System.out.println("排序之前的集合");
		Iterator<String> iterator1 = all.iterator();
		while(iterator1.hasNext()) {
			System.out.print(iterator1.next()+"、");
		}
		Collections.sort(all);
		System.out.println();
		System.out.println("排序之后的集合");
		iterator1 = all.iterator();
		while (iterator1.hasNext()) {
			System.out.print(iterator1.next()+"、");
		}
	}
}
