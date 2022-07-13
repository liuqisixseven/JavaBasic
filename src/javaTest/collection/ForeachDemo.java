package javaTest.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * foreach输出
 * @author w-liuqi
 *
 */
public class ForeachDemo {
	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("hello");
		all.add("_");
		all.add("world");
		for(String string : all) {
			System.out.print(string);
		}
	}
}
