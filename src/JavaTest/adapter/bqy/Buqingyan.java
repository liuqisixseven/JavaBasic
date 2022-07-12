package JavaTest.adapter.bqy;
//卜庆延的类适配器
public class Buqingyan extends EAT implements Drink{
    @Override
    public void drink(){
        System.out.println("我能喝。");
    }
}
