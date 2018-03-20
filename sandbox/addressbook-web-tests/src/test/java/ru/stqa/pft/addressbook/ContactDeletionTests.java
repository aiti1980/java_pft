package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBaseContact{

    @Test
    public void testsContactDeletion() {
        gotoEditFormContact();
        deleteContactAndBackMain();
    }

}
