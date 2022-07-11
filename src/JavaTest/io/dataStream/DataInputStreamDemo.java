package JavaTest.io.dataStream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 读取数据
 * @author w-liuqi
 *
 */
public class DataInputStreamDemo {
	public static void main(String[] args) throws IOException {
		DataInputStream dataInputStream = null;
		File file = new File("d:"+File.separator+"IOTest"+File.separator+"order.txt");
		dataInputStream = new DataInputStream(new FileInputStream(file));
		String name = null;
		float price = 0.0f;
		int num = 0;
		char temp[] = null;
		char c = 0;
		int len = 0;
		try {
			while (true) {
				temp = new char[200];
				len = 0;
				while ((c=dataInputStream.readChar())!='\t') {
					temp[len] = c;
					len++;
				}
				name = new String(temp,0,len);
				price = dataInputStream.readFloat();
				dataInputStream.readChar();
				num = dataInputStream.readInt();
				dataInputStream.readChar();
				System.out.printf("名称：%s;价格：%5.2f;数量：%d\n",name,price,num);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		dataInputStream.close();
	}
}
