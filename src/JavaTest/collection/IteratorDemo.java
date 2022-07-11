package JavaTest.collection;
import java.util.*;

public class IteratorDemo {
	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("hello");
		all.add("_");
		all.add("world");
		Iterator<String> iterator = all.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		System.out.println();
		iterator = all.iterator();
		while(iterator.hasNext()) {
			String string = iterator.next();
			if("_".equals(string)) {
				iterator.remove();
			}else {
				System.out.print(string);
			}
		}
		System.out.println("\n删除后的集合:"+all);
	}
}
