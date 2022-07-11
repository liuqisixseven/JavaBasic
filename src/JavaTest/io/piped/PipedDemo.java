package JavaTest.io.piped;

import java.io.IOException;

public class PipedDemo {
	public static void main(String[] args) {
		Send send = new Send();
		Receive receive = new Receive();
		try {
			send.getPipedOutputStream().connect(receive.getPipedInputStream());  //连接管道
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		new Thread(send).start();
		new Thread(receive).start();
	}
}
