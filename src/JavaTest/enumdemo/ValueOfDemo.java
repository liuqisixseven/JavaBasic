package JavaTest.enumdemo;

public class ValueOfDemo {
	public static void main(String[] args) {
		Color c = Enum.valueOf(Color.class, "BLUE");
		c.setName("蓝瑟");
		c.setName("蓝色");
		System.out.println(c.getName());
	}
}
