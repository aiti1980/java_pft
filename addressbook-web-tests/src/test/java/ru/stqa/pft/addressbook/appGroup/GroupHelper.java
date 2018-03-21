package ru.stqa.pft.addressbook.appGroup;

import Session.SessionHelperGroupAndContact;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.HelperBase.HelperBase;

/**
 * @author p.sidorenko.
 * @since 21.03.2018.
 */
public class GroupHelper extends HelperBase{

    public GroupHelper(FirefoxDriver wd) {
        super (wd);
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillgroupForm(SessionHelperGroupAndContact.GroupData groupData) {
        type("group_name", groupData.getName());
        type("group_header", groupData.getHeader());
        type("group_footer", groupData.getFooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }
}
