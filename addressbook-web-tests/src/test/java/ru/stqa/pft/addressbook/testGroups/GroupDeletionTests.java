package ru.stqa.pft.addressbook.testGroups;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBaseGroup {


  @Test
  public void testsGrouDeletion() {
    app.getNavigationHelper().gotoGrouppage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }

}
