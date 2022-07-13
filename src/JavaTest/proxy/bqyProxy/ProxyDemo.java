package JavaTest.proxy.bqyProxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Network net = new Real();
        Network network = new Proxy(net);
        network.browse();
    }
}
