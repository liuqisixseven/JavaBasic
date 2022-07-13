package javaTest.io.piped;

import java.io.IOException;
import java.io.PipedInputStream;

public class Receive implements Runnable{
	private PipedInputStream PipedInputStream = null;   //管道输出流
	public Receive() {
		this.PipedInputStream = new PipedInputStream();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		byte b[]=new byte[1024];
		int len = 0;
		try {
			len = this.PipedInputStream.read(b);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			this.PipedInputStream.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("接受的内容为："+ new String(b,0,len));
	}
	public PipedInputStream getPipedInputStream() {
		return PipedInputStream;
	}
}
