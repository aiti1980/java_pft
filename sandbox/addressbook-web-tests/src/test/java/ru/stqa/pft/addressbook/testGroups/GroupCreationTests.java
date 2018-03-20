package ru.stqa.pft.addressbook.testGroups;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.moduleGroup.GroupData;

public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() {

        app.gotoGrouppage();
        app.initGroupCreation();
        app.fillgroupForm(new GroupData("test1", "test2", "test3"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
