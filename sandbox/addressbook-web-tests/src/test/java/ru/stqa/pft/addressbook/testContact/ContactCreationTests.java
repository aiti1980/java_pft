package ru.stqa.pft.addressbook.testContact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.moduleContact.ContactData;

public class ContactCreationTests extends TestBaseContact{

    @Test
    public void testsContactCreation() {

        appContact.initContactCreation();
        appContact.fillContactForm(new ContactData("pavel", "sidorenko", "9997772211", "sidorenko-p@inbox.ru"));
        appContact.returnHomePage();
    }

}
