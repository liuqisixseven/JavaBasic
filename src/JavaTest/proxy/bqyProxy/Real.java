package JavaTest.proxy.bqyProxy;

public class Real implements Network{
    @Override
    public void browse() {
        System.out.println("网页看片儿！");
    }
}
