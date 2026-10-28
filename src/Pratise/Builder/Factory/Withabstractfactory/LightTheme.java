package Pratise.Builder.Factory.Withabstractfactory;

public class LightTheme implements ThemeFactory {
    @Override
    public Button createButton() {
        return new Lightbutton();
    }

    @Override
    public TextField CreateField() {
        return new LightTextField();
    }
}
