package abstractFactory;

public class Client {
    public static void main(String[] args) {
        SkinFactory skinFactory;
        Button button;
        skinFactory = new SpringSkinFactory();
        button = skinFactory.createButton();
        button.display();
    }
}
