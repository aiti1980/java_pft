package Session;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.HelperBase.HelperBase;

/**
 * @author p.sidorenko.
 * @since 21.03.2018.
 */
public class SessionHelperGroupAndContact extends HelperBase {

    public SessionHelperGroupAndContact(FirefoxDriver wd) {
        super (wd);
    }

    public void login(String user, String pass, By xpath, String username, String password) {
        type(By.name("user"), username);
        type(By.name("pass"), password);
        wd.findElement(xpath).click();
    }

    public static class GroupData {
      private final String name;
      private final String header;
      private final String footer;

      public GroupData(String name, String header, String footer) {
        this.name = name;
        this.header = header;
        this.footer = footer;
      }

      public String getName() {
        return name;
      }

      public String getHeader() {
        return header;
      }

      public String getFooter() {
        return footer;
      }
    }
}
