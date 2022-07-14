package javaTest.nolnner.bqyNolnner;

interface Eat{
    public void hungry();
}
class N{
    public void food1(){
        this.food2(new Eat() {
            @Override
            public void hungry() {
                System.out.println("饿了就吃食物");
            }
        });
    }
    public void food2(Eat e){
        e.hungry();
    }
}
public class BqyNolnnerClassDemo {
    public static void main(String[] args) {
        new N().food1();
    }
}