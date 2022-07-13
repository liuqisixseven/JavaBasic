package JavaTest.pol.bqy;

public class PolDemo2 {
    public static void main(String[] args) {
        Father father = new Son();
        Son son = (Son) father;//向下转型，需要指明要转型的子类类型
        son.sleep();
        son.asleep();
        son.dadun();
    }
}
