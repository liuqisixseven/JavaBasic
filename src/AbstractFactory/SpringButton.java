package AbstractFactory;

public class SpringButton implements Button{

    @Override
    public void display() {
        System.out.println("Spring Button");
    }
}
