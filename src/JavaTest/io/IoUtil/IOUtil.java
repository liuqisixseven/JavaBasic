package JavaTest.io.IoUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOUtil {
	/**
	 * 创建文件夹
	 * @param string1
	 * 文件位置
	 */
	public void Mkdir(String string1) {
		File f = new File(string1);
		f.mkdir();
		System.out.println("创建IOtest文件夹成功");
	}
	/**
	 * 创建文件
	 * @param string2
	 * 文件位置
	 */
	public void CreatNewFile(String string2) {
		String path = string2;
		File f = new File(path);
		if(f.exists()) {
			f.delete();
		}else {
			try {
				f.createNewFile();
				System.out.println("创建test1文件成功");
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	/**
	 * 向文件写入数据
	 * @param 
	 * string2 
	 * 文件位置
	 * @param str1 
	 * 数据内容
	 * @throws Exception
	 */
	public void OutputStream(String string2,String str1) throws Exception{
		File file = new File(string2);
		FileOutputStream outputStream = new FileOutputStream(file);
		String string = str1;
		byte b[] = string.getBytes();
		outputStream.write(b);
		outputStream.close();
		System.out.println("成功写入数据--->"+str1);
	}
	/**
	 * 向文件写入追加内容
	 * @param string2  
	 * 文件位置
	 * @param str2 
	 * 追加内容
	 * @throws Exception
	 */
	public void OutputStreamNext(String string2,String str2) throws Exception{
		File file = new File(string2);
		OutputStream outputStream = new FileOutputStream(file,true);
		String string =str2;
		outputStream.write(string.getBytes());
		outputStream.close();
		System.out.println("成功写入追加数据---->"+str2);
	}
	/**
	 * 读取文件内容
	 * @param string2 
	 * 文件位置
	 * @throws Exception
	 */
	public void InputStream(String string2) throws Exception{
		File file = new File(string2);
		InputStream inputStream = new FileInputStream(file);
		byte b[] = new byte[(int)file.length()];
		inputStream.read(b);
		inputStream.close();
		System.out.println("内容为"+new String(b));
	}
}
