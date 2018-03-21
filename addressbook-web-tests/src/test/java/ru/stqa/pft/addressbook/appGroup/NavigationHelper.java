package ru.stqa.pft.addressbook.appGroup;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author p.sidorenko.
 * @since 21.03.2018.
 */
public class NavigationHelper {
    private FirefoxDriver wd;

    public NavigationHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void gotoGrouppage() {
        wd.findElement(By.linkText("groups")).click();
    }
}
