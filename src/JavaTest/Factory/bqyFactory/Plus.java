package JavaTest.Factory.bqyFactory;

public class Plus implements Operation{
    @Override
    public void operation(float x, float y) {
        System.out.println(x + y);
    }
}
