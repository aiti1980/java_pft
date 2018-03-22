package ru.stqa.pft.addressbook.testGroups;

import Session.SessionHelperGroupAndContact;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBaseGroup {

    @Test
    public void testGroupCreation() {

        app.getNavigationHelper().gotoGrouppage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillgroupForm(new SessionHelperGroupAndContact.GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
