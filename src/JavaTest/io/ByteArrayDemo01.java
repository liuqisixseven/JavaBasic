package JavaTest.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 使用内存操作流完成大写字母转换小写字母
 * @author w-liuqi
 *
 */
public class ByteArrayDemo01 {
	public static void main(String[] args) {
		String string = "HELLOWORLD";
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(string.getBytes());
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		int temp = 0;
		while((temp=byteArrayInputStream.read())!=-1) {
			char c = (char)temp;
			byteArrayOutputStream.write(Character.toLowerCase(c));
		}
		String newString = byteArrayOutputStream.toString();
		try {
			byteArrayInputStream.close();
			byteArrayOutputStream.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(newString);
	}
}
