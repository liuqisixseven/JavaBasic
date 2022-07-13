package javaTest.adapter;

public class WindowImpl extends WindowAdapter{
	public void open() {
		System.out.println("窗口打开");
	}
	public void close() {
		System.out.println("窗口关闭");
	}
}
