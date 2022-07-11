package JavaTest.collection.util;

import java.util.Collections;
import java.util.List;

public class CollectionDemoUtil {
	
	//反转集合中的内容
	public List<String> Reverse(List<String> allList){
		Collections.reverse(allList);
		return allList;
	}
	
	
	//检索内容
	public int BinarySearch(List<String> allList,String string) {
		int point = Collections.binarySearch(allList, string);
		System.out.println();
		System.out.println("检索内容："+string);
		return point;
	}
	
	
	//替换集合中的内容
	public List<String> ReplaceAll(List<String> allList,String string1,String string2){
		Collections.replaceAll(allList, string1, string2);
		return allList;
	}
	
	
	//交换指定位置的内容
	public List<String> Swap(List<String> allList,int x,int y){
		Collections.swap(allList, x, y);
		return allList;
	}
}
