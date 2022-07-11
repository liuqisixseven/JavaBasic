package JavaTest.collection.list.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 增加数据的操作
 * @author w-liuqi
 *
 */
public class ArrayListDemo01 {
	public static void main(String[] args) {
		List<String> allList = new ArrayList<String>();
		Collection<String> allCollection = new ArrayList<String>();
		allList.add("Hello");
		allList.add(0,"World");
		System.out.println(allList);
		allCollection.add("刘琦");
		allCollection.add("www.liuqi.com");
		allList.addAll(0,allCollection);
		allList.addAll(allCollection);
		System.out.println(allList);
	}
}
