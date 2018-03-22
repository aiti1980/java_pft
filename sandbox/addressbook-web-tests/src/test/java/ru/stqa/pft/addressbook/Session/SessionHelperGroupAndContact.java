package Session;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author p.sidorenko.
 * @since 21.03.2018.
 */
public class SessionHelperGroupAndContact {
    private FirefoxDriver wd;
    public SessionHelperGroupAndContact(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void login(String user, String pass, By xpath, String username, String password) {
        wd.findElement(By.name(user)).click();
        wd.findElement(By.name(user)).clear();
        wd.findElement(By.name(user)).sendKeys(username);
        wd.findElement(By.name(pass)).click();
        wd.findElement(By.name(pass)).clear();
        wd.findElement(By.name(pass)).sendKeys(password);
        wd.findElement(xpath).click();
    }
}
