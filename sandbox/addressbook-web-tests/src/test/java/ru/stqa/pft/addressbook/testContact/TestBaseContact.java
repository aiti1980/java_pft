package ru.stqa.pft.addressbook.testContact;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appContact.ApplicationManagerContact;

/**
 * @author p.sidorenko.
 * @since 20.03.2018.
 */
public class TestBaseContact {

    protected final ApplicationManagerContact appContact = new ApplicationManagerContact();

    @BeforeMethod
    public void setUp() throws Exception {
        appContact.init();
    }

    @AfterMethod
    public void tearDown() {
        appContact.stop();
    }

}
