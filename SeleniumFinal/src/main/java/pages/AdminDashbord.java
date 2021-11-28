package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class AdminDashbord {

    /**
     * This static locator for methods
     */
public static final By DASHBORD_NAME = By.cssSelector("li.dropdown .dropdown-toggle");

    /**
     *Asserts if the validation message is contained when trying to login
     * @param expLoginName the expected validation login name
     * @param messagesOnFailure he message that will appear in your reports in case of failure
     */
    public static void verifyDashbordLoginName(String expLoginName, String messagesOnFailure) {
        Assert.assertTrue(Browser.driver.findElement(DASHBORD_NAME).getText().contains(expLoginName),messagesOnFailure);
    }
}
