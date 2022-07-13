package javaTest.Factory;

import java.util.Scanner;

public class FactoryMain {
	
	public static void main(String[] args) {
		Operation operation = null;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		float x = scanner.nextFloat();
		String op = scanner.next();
		float y = scanner.nextFloat();
		operation = Factory.getInstance(op);
		operation.operation(x, y);
		FactoryMain.main(args);
	}
}
