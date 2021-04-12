package abstractFactory;

import abstractFactory.themeFactory.DarkThemeFactory;
import abstractFactory.themeFactory.WhiteThemeFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        ThemeLoader themeLoader=new ThemeLoader();

        themeLoader.setThemeFactory(new WhiteThemeFactory());
        themeLoader.showTheme();

        themeLoader.setThemeFactory(new DarkThemeFactory());
        themeLoader.showTheme();
    }
}
