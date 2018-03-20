package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBaseContact{

    @Test
    public void testsContactCreation() {

        initContactCreation();
        fillContactForm(new ContactData("pavel", "sidorenko", "9997772211", "sidorenko-p@inbox.ru"));
        returnHomePage();
    }

}
