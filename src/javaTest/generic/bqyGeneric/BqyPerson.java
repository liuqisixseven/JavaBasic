package javaTest.generic.bqyGeneric;


public class BqyPerson <T extends BqyInfo>{
    private T info;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "BqyPerson{" +
                "info=" + info +
                '}';
    }
    public BqyPerson(T info){
        //super();
        this.info = info;
    }
}
