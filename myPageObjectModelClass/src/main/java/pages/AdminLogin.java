package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class AdminLogin  {

    private static final By ADMIN_LOGIN_BUTTON = By.cssSelector(".btn.btn-primary");
    private static final By INPUT_USERNAME_FIELD = By.id("input-username");
    private static final By INPUT_PASSWORD_FIELD = By.id("input-password");
    private static final By MASSAGE_INVALID_LOGIN = By.cssSelector(".alert-danger");

    /**
     * This method log you whit correct username and password
     * @param username the username you like to login whit
     * @param pass the pass you like to login whit
     */
    public static void login(String username, String pass) {
        Browser.driver.findElement(INPUT_USERNAME_FIELD).sendKeys(username);
        Browser.driver.findElement(INPUT_PASSWORD_FIELD).sendKeys(pass);
        Browser.driver.findElement(ADMIN_LOGIN_BUTTON).click();


    }

    public static void openPage() {
        Browser.driver.get("http://shop.pragmatic.bg/admin/");
    }

    public static void verifyValidationMessages(String expectedValidationMassage, String massageOnFailure) {
        String actualValidationMassageText =Browser.driver.findElement(MASSAGE_INVALID_LOGIN).getText();

        Assert.assertTrue(actualValidationMassageText.contains(expectedValidationMassage),massageOnFailure);
    }
}

