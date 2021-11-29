package pages.adminarea;

import org.openqa.selenium.By;
import utils.Browser;

public class AdminPageLogin {

    private static final By ADMIN_LOGIN_BUTTON = By.cssSelector(".btn.btn-primary");
    private static final By INPUT_USERNAME_FIELD = By.id("input-username");
    private static final By INPUT_PASSWORD_FIELD = By.id("input-password");


    /**
     * This method open the admin area  page
     */
    public static void openPage() {
        Browser.driver.get("http://shop.pragmatic.bg/admin/");
    }

    /**
     *This method log you whit correct username and password
     * @param username  the username you like to login whit
     * @param password the  password you like to login whit
     */
    public static void login(String username, String password) {
        Browser.driver.findElement(INPUT_USERNAME_FIELD).sendKeys(username);
        Browser.driver.findElement(INPUT_PASSWORD_FIELD).sendKeys(password);
        Browser.driver.findElement(ADMIN_LOGIN_BUTTON).click();

    }
}
