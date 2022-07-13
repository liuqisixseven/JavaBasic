package abstractFactory;

public class SpringSkinFactory implements SkinFactory{
    @Override
    public Button createButton() {
        Button button;
        button = new SpringButton();
        return button;
    }

    @Override
    public TextField createTextField() {
        TextField textField;
        textField = new SpringTextField();
        return textField;
    }

    @Override
    public ComboBox createComboBox() {
        ComboBox comboBox;
        comboBox = new SpringComboBox();
        return comboBox;
    }
}
