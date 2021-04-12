package abstractFactory.themeFactory;

import abstractFactory.components.button.Button;
import abstractFactory.components.button.DarkButton;
import abstractFactory.components.text.Text;
import abstractFactory.components.text.WhiteText;

public class DarkThemeFactory implements ThemeFactory{
    @Override
    public Button getButton() {
        return new DarkButton();
    }

    @Override
    public Text getText() {
        return new WhiteText();
    }
}
