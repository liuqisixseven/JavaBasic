package JavaTest.enumdemo;

public class SwitchPrintDemo {
	public static void main(String[] args) {
		for(Color c : Color.values()) {
			print(c);
		}
	}
	public static void print(Color color) {
		switch (color) {
		case RED:{
			System.out.println("红色");
			break;
		}
		case GREEN:{
			System.out.println("绿色");
			break;
		}
		case BLUE:{
			System.out.println("蓝色");
			break;
		}
		default:{
			System.out.println("未知");
			break;
		}
		}
	}
}
