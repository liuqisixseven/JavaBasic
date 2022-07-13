package abstractFactory;

public class SummerSkinFactory implements SkinFactory{
    @Override
    public Button createButton() {
        Button button;
        button = new SummerButton();
        return button;
    }

    @Override
    public TextField createTextField() {
        TextField textField;
        textField = new SummerTextField();
        return textField;
    }

    @Override
    public ComboBox createComboBox() {
        ComboBox comboBox;
        comboBox = new SummerComboBox();
        return comboBox;
    }
}
