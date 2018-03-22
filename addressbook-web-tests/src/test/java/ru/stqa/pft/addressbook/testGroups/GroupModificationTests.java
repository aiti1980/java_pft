package ru.stqa.pft.addressbook.testGroups;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBaseGroup {
  @Test
  public void testGroupModification(){
      app.getNavigationHelper().gotoGrouppage();
      app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillgroupForm(new Session.SessionHelperGroupAndContact.GroupData("test000", "testoo1", "test010"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }

}
