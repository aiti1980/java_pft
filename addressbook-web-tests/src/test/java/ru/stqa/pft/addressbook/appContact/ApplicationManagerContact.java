package ru.stqa.pft.addressbook.appContact;

import Session.SessionHelperGroupAndContact;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

/**
 * @author p.sidorenko.
 * @since 20.03.2018.
 */
public class ApplicationManagerContact {
    FirefoxDriver wd;

    private ContactHelper contactHelper;
    private SessionHelperGroupAndContact sessionHelperGroupAndContact;

    public void init() {
       wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
      wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  wd.get("http://localhost/addressbook/");
        contactHelper = new ContactHelper(wd);
sessionHelperGroupAndContact = new SessionHelperGroupAndContact(wd);
sessionHelperGroupAndContact.login("user", "pass", By.xpath("//form[@id='LoginForm']/input[3]"), "admin", "secret");
    }


    public void stop() {
        wd.quit();
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
