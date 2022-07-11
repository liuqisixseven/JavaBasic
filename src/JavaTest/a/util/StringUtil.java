package JavaTest.a.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class StringUtil {
	/**
	 * 字符串截取
	 * @param string
	 * 字符串
	 * @param start
	 * 起始位置
	 * @param end
	 * 结束位置
	 */
	public  String SubString(String string,int start,int end) {
		return string.substring(start,end);  //hello
	}
	/**
	 * 按照指定的字符串拆分字符串
	 * @param string
	 * 字符串
	 * @param str
	 * 分隔符
	 * @return 
	 */
	public   String[] Split(String string,String str) {
		String s[]=string.split(str);
		return s;
	}
	/**
	 * 字符串大写转换
	 * @param string
	 * 字符串
	 */
	public  String ToUpperCase(String string) {
		return string.toUpperCase();
	}
	/**
	 * 字符串小写转换
	 * @param string
	 * 字符串
	 */
	public String Replace(String string,String str1,String str2) {
		String newString = string.replace(str1, str2);
		return newString; //hexxo
	}
	public void OutputStreamNext(String string2,StringBuffer sql) throws Exception{
		File file = new File(string2);
		OutputStream outputStream = new FileOutputStream(file,true);
		outputStream.write(sql.toString().getBytes());
		outputStream.close();
	}
}
