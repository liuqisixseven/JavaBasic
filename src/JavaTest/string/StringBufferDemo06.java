package JavaTest.string;

/**
 * 字符串截取
 * @author w-liuqi
 *
 */
public class StringBufferDemo06 {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Hello ").append("World!!");
		stringBuffer.replace(6, 11, "LIUQI");
		String str = stringBuffer.substring(6,stringBuffer.length());
		System.out.println("截取之后的内容"+str);
	}
}
