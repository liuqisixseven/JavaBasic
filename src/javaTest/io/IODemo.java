package javaTest.io;


import javaTest.io.IoUtil.IOUtil;

import java.io.File;

public class IODemo {
	public static void main(String[] args) throws Exception {
		String string1 = "d:"+File.separator+"IOTest";
		String string2 = "d:"+File.separator+"IOTest"+File.separator+"test1.txt";
		IOUtil ioUtil = new IOUtil();
		ioUtil.Mkdir(string1);
		ioUtil.CreatNewFile(string2);
		ioUtil.OutputStream(string2,"哈喽");
		ioUtil.OutputStreamNext(string2,"\r\nHelloWorld!!");
		ioUtil.InputStream(string2);
	}
}
