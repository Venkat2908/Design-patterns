package Factory.Withabstractfactory;

public class DarkTheme implements ThemeFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextField CreateField() {
        return new DarkTextField();
    }
}
