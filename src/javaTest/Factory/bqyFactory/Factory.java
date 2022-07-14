package javaTest.Factory.bqyFactory;

public class Factory {
    public static Operation getOperator(String operator){
        Operation o = null;
        switch (operator){
            case "+":
                o = new Plus();
                break;
            case "-":
                o = new Minus();
                break;
            case "*":
                o = new Multiply();
                break;
            case "/":
                o = new Divide();
                break;
        }
        return o;
    }
}
