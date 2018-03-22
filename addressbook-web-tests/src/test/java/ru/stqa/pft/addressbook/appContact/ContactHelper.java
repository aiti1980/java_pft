package ru.stqa.pft.addressbook.appContact;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.HelperBase.HelperBase;
import ru.stqa.pft.addressbook.moduleContact.ContactData;

/**
 * @author p.sidorenko.
 * @since 21.03.2018.
 */
public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returnHomePage() {
    click(By.linkText("home page"));
  }

  private void sendFormCreateContact() {
    click(By.name("submit"));
  }


  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstName());
    type(By.name("lastname"), contactData.getLastName());
    type(By.name("mobile"), contactData.getMobile());
    type(By.name("email"), contactData.getEmail());
    sendFormCreateContact();
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void deleteContactAndBackMain() {
    click(By.xpath("//div[@id='content']/form[2]/input[2]"));
  }

  public void gotoEditFormContact() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[3]/td[8]/a/img"));
  }

//public void initGroupModification() {
//click(By.xpath("//table[@id='maintable']/tbody/tr[3]/td[8]/a/img"));}
 // public void selectContact() {click(By.name("selected[]"));
 // }
public void clickContactModification(){
  click(By.xpath("//form[@adressbook='']//input"));

  }
  public void modifiyContactModification(){
    click(By.name("modifiy"));
  }
public void submitContactModification() {
 click(By.name("update"));
 }
public void selectContactModificaion()
 {
click(By.xpath("//table[@id='maintable']/tbody/tr[4]/td[7]/a/img"));
}
    //div[@id='content']/form[1]
  }
