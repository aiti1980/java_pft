package ru.stqa.pft.addressbook.appContact;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import ru.stqa.pft.addressbook.moduleContact.ContactData;

import java.util.concurrent.TimeUnit;

/**
 * @author p.sidorenko.
 * @since 20.03.2018.
 */
public class ApplicationManagerContact {
    FirefoxDriver wd;

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
        Login("user", "pass", By.xpath("//form[@id='LoginForm']/input[3]"), "admin", "secret");
    }

    private void Login(String user, String pass, By xpath, String username, String password) {
        wd.findElement(By.name(user)).click();
        wd.findElement(By.name(user)).clear();
        wd.findElement(By.name(user)).sendKeys(username);
        wd.findElement(By.name(pass)).click();
        wd.findElement(By.name(pass)).clear();
        wd.findElement(By.name(pass)).sendKeys(password);
        wd.findElement(xpath).click();
    }

    public void returnHomePage() {
        wd.findElement(By.linkText("home page")).click();
    }

    public void fillContactForm(ContactData contactData) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(contactData.getName());
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(contactData.getMobile());
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
        sendFormCreateContact();
    }

    private void sendFormCreateContact() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    public void initContactCreation() {
        wd.findElement(By.linkText("add new")).click();
    }

    public void stop() {
        wd.quit();
    }

    public void deleteContactAndBackMain() {
        wd.findElement(By.xpath("//div[@id='content']/form[2]/input[2]")).click();
    }

    public void gotoEditFormContact() {
        wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[3]/td[8]/a/img")).click();
    }
}
