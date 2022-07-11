package JavaTest.string;

/**
 * 删除指定范围的字符串
 * @author w-liuqi
 *
 */
public class StringBufferDemo07 {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Hello ").append("World!!");
		stringBuffer.replace(6, 11, "LIUQI");
		String string = stringBuffer.delete(5, stringBuffer.length()-2).toString();
		System.out.println("删除之后的内容"+string);
	}
}
