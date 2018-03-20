package ru.stqa.pft.addressbook.testGroups;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.testGroups.TestBase;

public class GroupDeletionTests extends TestBase {
    

    @Test
    public void testsGrouDeletion() {
   app.gotoGrouppage();
        app.selectGroup();
        app.deleteSelectedGroups();
app.returnToGroupPage();
    }

}
