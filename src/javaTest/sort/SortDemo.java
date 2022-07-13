package javaTest.sort;

import javaTest.sort.sortUtil.SortUtil;

import java.util.Date;


public class SortDemo {
	public static void main(String[] args) {
		SortUtil sortUtil = new SortUtil();
		int a[]= {4,3,7,1,2,8,6,5,4,52,56,35,75,23,54,64,82,42,24,75,34,34,54,76,12,56,25,36};
		long begin = new Date().getTime();
		int b[]=sortUtil.BubbleSort(a);
//		int b[]=sortUtil.InsertionSort(a);
//		int b[]=sortUtil.ShellSort(a);
//		int b[]=sortUtil.QuickSort(a, 0, a.length-1);
//		int b[]=sortUtil.QuickSelectionSort(a);
//		int c[]=new int[a.length];
//		int b[]=sortUtil.MergeSort(a, 0, a.length-1, c);
		long end = new Date().getTime();
		System.out.println((end-begin)+"s");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+"、");
		}
	}
}