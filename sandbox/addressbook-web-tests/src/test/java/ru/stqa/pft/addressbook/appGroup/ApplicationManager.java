package ru.stqa.pft.addressbook.appGroup;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import ru.stqa.pft.addressbook.moduleGroup.GroupData;

import java.util.concurrent.TimeUnit;

/**
 * @author p.sidorenko.
 * @since 20.03.2018.
 */
public class ApplicationManager {
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

    public void returnToGroupPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void fillgroupForm(GroupData groupData) {
        Login("group_name", "group_header", By.name("group_footer"), groupData.getName(), groupData.getHeader());
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void initGroupCreation() {
        wd.findElement(By.name("new")).click();
    }

    public void gotoGrouppage() {
        wd.findElement(By.linkText("groups")).click();
    }

    public void stop() {
        wd.quit();
    }
    public void deleteSelectedGroups() {
        wd.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        wd.findElement(By.name("selected[]")).click();
    }
}
