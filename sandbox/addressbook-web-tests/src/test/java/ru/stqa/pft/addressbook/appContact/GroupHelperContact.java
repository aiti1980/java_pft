package ru.stqa.pft.addressbook.appContact;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.moduleContact.ContactData;

/**
 * @author p.sidorenko.
 * @since 21.03.2018.
 */
public class GroupHelperContact {
   private FirefoxDriver wd;

    public GroupHelperContact(FirefoxDriver wd) {
        this.wd = wd;
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

    public void deleteContactAndBackMain() {
        wd.findElement(By.xpath("//div[@id='content']/form[2]/input[2]")).click();
    }

    public void gotoEditFormContact() {
        wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[3]/td[8]/a/img")).click();
    }
}
