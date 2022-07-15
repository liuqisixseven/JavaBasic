package javaTest.producerConsumer.bqyProducerConsumer;


public class BqyThreadCaseDemo {
    public static void main(String[] args) {
        BqyInfo info = new BqyInfo();
        BqyProducer bqyProducer = new BqyProducer(info);
        BqyConsumer bqyConsumer = new BqyConsumer(info);
        new Thread(bqyProducer).start();
        new Thread(bqyConsumer).start();
    }
}
