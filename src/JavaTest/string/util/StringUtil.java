package JavaTest.string.util;

public class StringUtil {
	/**
	 * 字符串与字符数组的转换
	 * @param string
	 * 字符串
	 */
	public  void ToCharArray(String string) {
		char c[] = string.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+"\t");
		}
		System.out.println();
	}
	/**
	 * 将字符数组转换为String
	 * @param c
	 * 字符数组
	 * @param start
	 * 起始下标
	 * @param end
	 * 结束下标
	 */
	public void ToString(char[] c,int start,int end) {
		String string = new String(c,start,end);   //将部分字符数组变为String
		System.out.println(string);
	}
	
	/**
	 * 从字符串中取出指定位置的字符
	 * @param string
	 * 字符串
	 * @param a
	 * 取出字符位置
	 */
	public void CharAt(String string,int a) {
		System.out.println(string.charAt(a));   //出去字符串中第四个字符
	}
	/**
	 * 字符串与byte数组的转换
	 * @param string
	 * 字符串
	* @param start
	 * 起始下标
	 * @param end
	 * 结束下标
	 */
	public  void GetBytes(String string,int start,int end) {
		byte b[]=string.getBytes();
		System.out.println(new String(b,start,end));
	}
	/**
	 * 取得一个字符串的长度
	 * @param string
	 * 字符串
	 */
	public  void Length(String string) {
		System.out.println(string+"长度为"+string.length());
	}
	/**
	 * 查找一个指定的字符串是否存在
	 * @param string
	 * 字符串
	 * @param str
	 * 要查找的字符串
	 * @param a
	 * 从第a位置开始
	 */
	public  void IndexOf(String string,String str,int a) {
		if(string.indexOf(str,a)!=-1) {
			System.out.println(string.indexOf(str,a));
		}else {
			System.out.println("未找到匹配的字符串");
		}
	}
	/**
	 * 去掉左右空格
	 * @param string
	 * 字符串
	 */
	public  void Trim(String string) {
		System.out.println(string.trim());
	}
	/**
	 * 字符串截取
	 * @param string
	 * 字符串
	 * @param start
	 * 起始位置
	 * @param end
	 * 结束位置
	 */
	public  void SubString(String string,int start,int end) {
		System.out.println(string.substring(start,end));  //hello
	}
	/**
	 * 按照指定的字符串拆分字符串
	 * @param string
	 * 字符串
	 * @param str
	 * 分隔符
	 */
	public  void Split(String string,String str) {
		String s[]=string.split(str);
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);    //hello   world
		}
	}
	/**
	 * 字符串大写转换
	 * @param string
	 * 字符串
	 */
	public  void ToUpperCase(String string) {
		System.out.println("将"+string+"转成大写:"+string.toUpperCase()); 
	}
	/**
	 * 字符串小写转换
	 * @param string
	 * 字符串
	 */
	public  void ToLowerCase(String string) {
		System.out.println("将"+string+"转成小写:"+string.toLowerCase()); 
	}
	/**
	 * 判断是否以指定的字符串开头
	 * @param string
	 * 字符串
	 *  @param str
	 *  指定字符串
	 */
	public  void StartsWith(String string,String str) {
		if(string.startsWith(str)) {
			System.out.println(string+"以"+str+"开头");
		}
	}
	/**
	 * 判断是否以指定的字符串结尾
	 * @param string
	 * 字符串
	 *  @param str
	 *  指定字符串
	 */
	public  void EndsWith(String string,String str) {
		if(string.endsWith(str)) {
			System.out.println(string+"以"+str+"结尾");
		}
	}
	
	/**
	 *  不区分大小写进行字符串比较
	 * @param string1
	 * @param string2
	 */
	public  void EqualsIgnoreCase(String string1,String string2) {
		System.out.println(string1+"和"+string2+"不缺分大小写进行比较"+string1.equalsIgnoreCase(string2));
	}
	/**
	 * 将一个指定的字符串替换成其他字符串
	 * @param string
	 * @param str1
	 * @param str2
	 */
	public  void Replace(String string,String str1,String str2) {
		String newString = string.replace(str1, str2);
		System.out.println(newString); //hexxo
	}
}
