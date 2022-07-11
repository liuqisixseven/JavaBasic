package JavaTest.sort.sortUtil;

public class SortUtil {
	//冒泡排序
	/**
	 * 冒泡排序
	 * @param a 数组
	 * @return
	 */
	public int[] BubbleSort(int a[]) {
		int temp;
		int flag=1;
		int j=a.length-1;
		while(flag==1) {
			flag=0;
			for(int i=1;i<=j;i++) {
				if(a[i-1]>a[i]) {
					temp=a[i];
					a[i]=a[i-1];
					a[i-1]=temp;
					flag=1;
				}
			}
			j--;
		}
			return a;
	}
	/**
	 * 插入排序
	 * @param a 数组
	 * @return
	 */
	public int[] InsertionSort(int a[]) {
		int temp;
		for(int i=1;i<a.length;i++) {
			temp=a[i];
			for(int j=i-1;j>=0&&temp<a[j];j--) {
				a[j+1]=a[j];
				a[j]=temp;
			}
		}
		return a;
	}
	/**
	 * 希尔排序
	 * @param a
	 * @param n
	 * @param d
	 * @return
	 */
	public int[] ShellSort(int a[]) {
		int temp;
		int d=1;
		for(int i=d;i<a.length;i++) {
			temp=a[i];
			for(int j=i-d;j>=0&&temp<a[j];j=j-d) {
				a[j+d]=a[j];
				a[j]=temp;
			}
		}
		return a;
	}
	/**
	 * 快速排序  i为首元素下标，j为尾元素下标
	 * @param a
	 * @param i
	 * @param j
	 * @return
	 */
	public int[] QuickSort(int a[],int i,int j) {
		int k;
		if(i<j) {
			k=Partition(a,i,j);
			QuickSort(a, i, k-1);
			QuickSort(a, k+1, j);
		}
		return a;
	}
	public int Partition(int a[],int i,int j) {
		int temp=a[i];
		while(i<j) {
			while(a[j]>=temp&&i<j) {
				j--;
			}
			if(i<j) {
				a[i++]=a[j];
			}
			while(a[i]<=temp&&i<j) {
				i++;
			}
			if(i<j) {
				a[j--]=a[i];
			}
		}
		a[i]=temp;
		return i;
	}
		/**
		 * 简单选择排序
		 * @param a
		 * @return
		 */
	public int[] QuickSelectionSort(int a[]) {
		int min;
		int temp;
		for(int i=0;i<a.length-1;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					temp=a[j];
					a[j]=a[min];
					a[min]=temp;
				}
			}
		}
		return a;
	}
		/**
		 * 归并排序
		 * @param a
		 * @param i 为首元素下标
		 * @param j 为尾元素下标
		 * @param b 协助数组
		 * @return
		 */
		public int[] MergeSort(int a[],int i,int j,int b[]) {
			int k;
			if(i<j) {
				k=(i+j)/2;
				MergeSort(a,i,k,b);
				MergeSort(a,k+1,j,b);
				Merge(a,i,k,k+1,j,b);
			}
			return a;
		}
		public int[] Merge(int a[],int s1,int e1,int s2,int e2,int b[]) {
			int k=s1;int i=s1;
			while((s1<=e1)&&(s2<=e2)) {
				if(a[s1]<=a[s2]) {
					b[k++]=a[s1++];
				}else {
					b[k++]=a[s2++];
				}
			}
			while(s1<=e1) {
				b[k++]=a[s1++];
			}
			while(s2<=e2) {
				b[k++]=a[s2++];
			}
			k--;
			while(k>=i) {
				a[k]=b[k];
				k--;
			}
			return b;
		}
}
