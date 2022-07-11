package JavaTest.io.dataStream;

import java.io.*;

/**
 * 将订单数据写入到文件order.txt中
 * @author w-liuqi
 *
 */
public class DataOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		DataOutputStream dataOutputStream = null;
		File file = new File("d:"+File.separator+"IOTest"+File.separator+"order.txt");
		dataOutputStream = new DataOutputStream(new FileOutputStream(file));
		String names[]= {"衬衣","手套","围巾"};
		float prices[]= {98.3f,30.3f,50.5f};
		int nums[]= {3,2,1};
		for(int i=0;i<names.length;i++) {
			dataOutputStream.writeChars(names[i]);
			dataOutputStream.writeChar('\t');
			dataOutputStream.writeFloat(prices[i]);
			dataOutputStream.writeChar('\t');
			dataOutputStream.writeInt(nums[i]);
			dataOutputStream.writeChar('\n');
		}
		dataOutputStream.close();
	}
}
