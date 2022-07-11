package JavaTest.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * 删除对象
 * @author w-liuqi
 *
 */
public class ArrayListDemo02 {
	public static void main(String[] args) {
		List<String> allList = new ArrayList<String>();
		allList.add("Hello");
		allList.add(0,"World");
		allList.add("JAVA");
		allList.add("www.liuqi.com");
		allList.remove(0);
		allList.remove("Hello");
		System.out.println(allList);
	}
}
