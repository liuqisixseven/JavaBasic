package javaTest.string;

/**
 * 内容修改
 * @author w-liuqi
 *
 */
public class StringBufferDemo02 {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Hello ");
		fun(stringBuffer);
		System.out.println(stringBuffer);
	}
	public static void fun(StringBuffer stringBuffer) {
		stringBuffer.append("JAVA").append("LIUQI");
	}
}