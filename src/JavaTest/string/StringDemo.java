package JavaTest.string;


import JavaTest.string.util.StringUtil;

public class StringDemo {
	public static void main(String[] args) {
		StringUtil stringUtil = new StringUtil();
		String string ="hello world!";
		stringUtil.ToCharArray(string);
		char[] c= {'h','e','l','l','o',' ','w','o','r','l','d'};
		stringUtil.ToString(c, 0, c.length);
		stringUtil.CharAt(string, 4);
		stringUtil.GetBytes(string, 0, string.length());
		stringUtil.Length(string);
		stringUtil.IndexOf(string, "word", 0);
		String str1="   hello    ";
		stringUtil.Trim(str1);
		stringUtil.SubString(string, 0, 5);
		stringUtil.Split(string, " ");
		stringUtil.ToUpperCase(string);
		stringUtil.ToLowerCase("HELLO WORLD");
		stringUtil.StartsWith("**HELLO", "**");
		stringUtil.EndsWith("**HELLO**", "**");
		stringUtil.EqualsIgnoreCase(string, "HELLO WORLD!");
		stringUtil.Replace(string, "ll", "OO");
	}
}
