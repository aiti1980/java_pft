package ru.stqa.pft.addressbook.testGroups;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.moduleGroup.GroupData;

public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() {

        app.getNavigationHelper().gotoGrouppage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillgroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
