package javaTest.enumdemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ComparableEnum {
	public static void main(String[] args) {
		Set<Color> t = new TreeSet<Color>();
		t.add(Color.GREEN);
		t.add(Color.BLUE);
		t.add(Color.RED);
		Iterator<Color> iterator = t.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+"、");
		}
	}
}
