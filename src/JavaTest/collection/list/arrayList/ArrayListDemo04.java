package JavaTest.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * 将集合变为对象数组
 * @author w-liuqi
 *
 */
public class ArrayListDemo04 {
	public static void main(String[] args) {
		List<String> allList = new ArrayList<String>();
		allList.add("Hello");
		allList.add(0,"World");
		allList.add("JAVA");
		allList.add("www.liuqi.com");
		String string[] = allList.toArray(new String[] {});
		System.out.print("指定数组类型：");
		for (int i = 0; i < string.length; i++) {
			System.out.print(string[i]+"、");
		}
		System.out.print("\n返回对象数组：");
		Object obj[] = allList.toArray();
		for (int i = 0; i < obj.length; i++) {
			String temp = (String) obj[i];
			System.out.print(temp+"、");
		}
	}
}
