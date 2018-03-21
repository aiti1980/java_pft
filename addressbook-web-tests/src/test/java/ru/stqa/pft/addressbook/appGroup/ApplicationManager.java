package ru.stqa.pft.addressbook.appGroup;

import Session.SessionHelperGroupAndContact;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

/**
 * @author p.sidorenko.
 * @since 20.03.2018.
 */
public class ApplicationManager {
    FirefoxDriver wd;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    public SessionHelperGroupAndContact sessionHelperGroupAndContact;


    public void init() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
       wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
   wd.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelperGroupAndContact = new SessionHelperGroupAndContact(wd);
        sessionHelperGroupAndContact.login("user", "pass", By.xpath("//form[@id='LoginForm']/input[3]"), "admin", "secret");
    }


    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
