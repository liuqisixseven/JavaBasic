package javaTest.system;

/**
 * 数组复制
 * @author w-liuqi
 *
 */
public class SystemDemo04 {
	public static void main(String[] args) {
		int i1[] = {1,2,3,4,5,6,7};
		int i2[] = {8,9,10,11,12};
		System.arraycopy(i1, 0, i2, 0, 3);
		for (int i = 0; i < i2.length; i++) {
			System.out.print(i2[i]+"\t");
		}
	}
}
