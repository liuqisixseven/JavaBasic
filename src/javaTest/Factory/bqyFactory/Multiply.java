package javaTest.Factory.bqyFactory;

public class Multiply implements Operation{
    @Override
    public void operation(float x, float y) {
        System.out.println(x * y);
    }
}
