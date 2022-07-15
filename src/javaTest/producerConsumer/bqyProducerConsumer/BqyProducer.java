package javaTest.producerConsumer.bqyProducerConsumer;



public class BqyProducer implements Runnable{
    private BqyInfo info = null;
    public BqyProducer(BqyInfo info){this.info = info;}

    @Override
    public void run() {
        boolean flag = false;
        for (int i = 0;i < 10;i++){
            if (flag){
                this.info.set("卜庆延","Java");
                flag = false;
            }else {
                this.info.set("CSDN","www.buqingyan.com");
                flag = true;
            }
        }
    }
}
