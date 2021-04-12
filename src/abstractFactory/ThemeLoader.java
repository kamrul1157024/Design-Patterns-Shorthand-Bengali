package abstractFactory;

import abstractFactory.themeFactory.ThemeFactory;

public class ThemeLoader {

    ThemeFactory themeFactory=null;

    public ThemeLoader()
    {

    }

    void setThemeFactory(ThemeFactory themeFactory)
    {
        this.themeFactory=themeFactory;
    }

    void showTheme()
    {
        if (themeFactory==null)
        {
            System.out.println("No Theme Has been Set!");
            return;
        }

        themeFactory.getButton().show();
        themeFactory.getText().show();

    }


}
