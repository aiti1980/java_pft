package ru.stqa.pft.addressbook.testContact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.moduleContact.ContactData;

public class ContactModificationTests  extends TestBaseContact {
    @Test
    public void testContactModification(){
        appContact.getContactHelper().selectContactModificaion();
        appContact.getContactHelper().modifiyContactModification();
        appContact.getContactHelper().fillContactForm(new ContactData("vovan", "vasiliev", "murzick", "vovan@inbox.ru"));
        appContact.getContactHelper().submitContactModification();
        appContact.getContactHelper().returnHomePage();
    }



}
