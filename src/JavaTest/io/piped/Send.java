package JavaTest.io.piped;

import java.io.IOException;
import java.io.PipedOutputStream;

public class Send implements Runnable{
	private PipedOutputStream pipedOutputStream = null;   //管道输出流
	public Send() {
		this.pipedOutputStream = new PipedOutputStream();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String string = "Hello World!!!";
		try {
			this.pipedOutputStream.write(string.getBytes());
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			this.pipedOutputStream.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public PipedOutputStream getPipedOutputStream() {
		return pipedOutputStream;
	}
}
