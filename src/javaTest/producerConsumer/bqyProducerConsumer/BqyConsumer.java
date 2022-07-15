package javaTest.producerConsumer.bqyProducerConsumer;

public class BqyConsumer implements Runnable{
    private BqyInfo info = null;
    public BqyConsumer(BqyInfo info){this.info = info;}

    @Override
    public void run() {
        for (int i = 0;i < 10;i++){
            try{
                Thread.sleep(400);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            this.info.get();
        }
    }
}
