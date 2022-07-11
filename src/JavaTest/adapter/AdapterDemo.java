package JavaTest.adapter;

public class AdapterDemo {
	public static void main(String[] args) {
		Window win = new WindowImpl();
		win.open();
		win.close();
	}
}
