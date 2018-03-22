package ru.stqa.pft.addressbook.testContact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.moduleContact.ContactData;

public class ContactCreationTests extends TestBaseContact{

    @Test
    public void testsContactCreation() {

        appContact.getContactHelper().initContactCreation();
        appContact.getContactHelper().fillContactForm(new ContactData("pavel", "sidorenko", "murzick", "sidorenko-p@inbox.ru"));
        appContact.getContactHelper().returnHomePage();
    }

}
