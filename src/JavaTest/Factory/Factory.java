package JavaTest.Factory;

public class Factory {
	public static Operation getInstance(String className) {
		Operation f =null;
		switch (className) {
		case "+":
			f = new Add();
			break;
		case "-":
			f = new Reduce();
			break;
		case "*":
			f = new Multiply();
			break;
		case "/":
			f = new Except();
			break;
		}
		return f;
	}
}
