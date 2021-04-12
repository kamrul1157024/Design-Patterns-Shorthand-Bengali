package abstractFactory.themeFactory;

import abstractFactory.components.button.Button;
import abstractFactory.components.button.WhiteButton;
import abstractFactory.components.text.DarkText;
import abstractFactory.components.text.Text;

public class WhiteThemeFactory implements ThemeFactory{
    @Override
    public Button getButton() {
        return new WhiteButton();
    }

    @Override
    public Text getText() {
        return new DarkText();
    }
}
