package javaTest.system;

/**
 * 取得本机的全部环境属性
 * @author w-liuqi
 *
 */
public class SystemDemo02 {
	public static void main(String[] args) {
		System.getProperties().list(System.out);;
	}
}
