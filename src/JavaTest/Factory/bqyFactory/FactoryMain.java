package JavaTest.Factory.bqyFactory;

import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) {
        Operation operation = null;
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        String o = scanner.next();
        float y = scanner.nextFloat();
        operation = Factory.getOperator(o);
        operation.operation(x,y);
        //FactoryMain.main(args);
    }
}
