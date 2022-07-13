package javaTest.string;

/**
 * 字符串连接
 * @author w-liuqi
 *
 */
public class StringBufferDemo01 {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Hello ");
		stringBuffer.append("World").append("!!!");
		stringBuffer.append("\n");
		stringBuffer.append("数字=").append(1).append("\n");
		stringBuffer.append("字符=").append('C').append("\n");
		stringBuffer.append("布尔=").append(true);
		System.out.println(stringBuffer);
	}
}
