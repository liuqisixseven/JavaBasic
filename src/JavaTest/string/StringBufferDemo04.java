package JavaTest.string;

/**
 * 字符串反转
 * @author w-liuqi
 *
 */
public class StringBufferDemo04 {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("World!!");
		stringBuffer.insert(0, "Hello");
		String string = stringBuffer.reverse().toString();
		System.out.println(string);
	}
}
