package javaTest.string;

/**
 * 任意位置添加内容
 * @author w-liuqi
 *
 */
public class StringBufferDemo03 {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("World!!");
		stringBuffer.insert(0,"hello");
		System.out.println(stringBuffer);
		stringBuffer.insert(stringBuffer.length(), "JAVA~");
		System.out.println(stringBuffer);
	}
}
