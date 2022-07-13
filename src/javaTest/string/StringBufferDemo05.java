package javaTest.string;

/**
 * 替换指定范围的内容
 * @author w-liuqi
 *
 */
public class StringBufferDemo05 {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Hello ").append("World!!");
		stringBuffer.replace(6, 11, "LIUQI");
		System.out.println(stringBuffer);
	}
}
