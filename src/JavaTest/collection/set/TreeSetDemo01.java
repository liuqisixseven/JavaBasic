package JavaTest.collection.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * 验证TreeSet类
 * @author w-liuqi
 *
 */
public class TreeSetDemo01 {
	public static void main(String[] args) {
		Set<String> allSet = new TreeSet<String>();
		allSet.add("C");
		allSet.add("C");
		allSet.add("C");
		allSet.add("D");
		allSet.add("B");
		allSet.add("A");
		allSet.add("E");
		System.out.println(allSet);
	}
}
