package javaTest.collection;
import java.util.*;

public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("hello");
		all.add("_");
		all.add("world");
		ListIterator<String> listIterator = all.listIterator();
		System.out.println("从前向后输出：");
		while(listIterator.hasNext()) {
			String string = listIterator.next();
			System.out.print(string+"、");
			listIterator.set("LI_"+string);
		}
		System.out.println("\n由后向前输出：");  //必须先进行从前向后输出
		listIterator.add("LQ");
		while (listIterator.hasPrevious()) {
			String string = (String) listIterator.previous();
			System.out.print(string+"、");
		}
	}
}
