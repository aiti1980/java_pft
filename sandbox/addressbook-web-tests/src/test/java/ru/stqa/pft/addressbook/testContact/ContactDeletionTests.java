package ru.stqa.pft.addressbook.testContact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.testContact.TestBaseContact;

public class ContactDeletionTests extends TestBaseContact {

    @Test
    public void testsContactDeletion() {
        appContact.gotoEditFormContact();
        appContact.deleteContactAndBackMain();
    }

}
