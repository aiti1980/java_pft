package ru.stqa.pft.addressbook.testContact;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBaseContact {

    @Test
    public void testsContactDeletion() {
        appContact.getGroupHelperContact().gotoEditFormContact();
        appContact.getGroupHelperContact().deleteContactAndBackMain();
    }

}
