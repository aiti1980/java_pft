package ru.stqa.pft.addressbook.appGroup;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.HelperBase.HelperBase;

/**
 * @author p.sidorenko.
 * @since 21.03.2018.
 */
public class NavigationHelper extends HelperBase {

    public NavigationHelper(FirefoxDriver wd) {
        super (wd);
    }

    public void gotoGrouppage() {
        click(By.linkText("groups"));
    }
}
