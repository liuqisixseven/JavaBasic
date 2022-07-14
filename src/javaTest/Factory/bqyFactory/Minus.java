package javaTest.Factory.bqyFactory;

public class Minus implements Operation{
    @Override
    public void operation(float x, float y) {
        System.out.println(x - y);
    }
}
