package javaTest.Factory.bqyFactory;

public class Divide implements Operation{
    @Override
    public void operation(float x, float y) {
        System.out.println(x / y);
    }
}
