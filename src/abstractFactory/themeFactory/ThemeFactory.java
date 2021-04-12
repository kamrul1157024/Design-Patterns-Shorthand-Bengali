package abstractFactory.themeFactory;

import abstractFactory.components.button.Button;
import abstractFactory.components.text.Text;

public interface ThemeFactory {
    Button getButton();
    Text getText();
}
