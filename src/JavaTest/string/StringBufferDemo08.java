package JavaTest.string;

/**
 * 查找指定的内容是否存在
 * @author w-liuqi
 *
 */
public class StringBufferDemo08 {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Hello ").append("World!!");
		if(stringBuffer.indexOf("Hello")==-1) {
			System.out.println("没有找到指定的内容");
		}else {
			System.out.println("可以找到指定的内容");
		}
	}
}
