package ru.stqa.pft.addressbook.appContact;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import Session.SessionHelperGroupAndContact;

import java.util.concurrent.TimeUnit;

/**
 * @author p.sidorenko.
 * @since 20.03.2018.
 */
public class ApplicationManagerContact {
    FirefoxDriver wd;

    private GroupHelperContact groupHelperContact;
    private SessionHelperGroupAndContact sessionHelperGroupAndContact;
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
       wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
      wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  wd.get("http://localhost/addressbook/");
        groupHelperContact = new GroupHelperContact(wd);
sessionHelperGroupAndContact = new SessionHelperGroupAndContact(wd);
sessionHelperGroupAndContact.login("user", "pass", By.xpath("//form[@id='LoginForm']/input[3]"), "admin", "secret");
    }


    public void stop() {
        wd.quit();
    }

    public GroupHelperContact getGroupHelperContact() {
        return groupHelperContact;
    }
}
