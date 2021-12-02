package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;


public class AdminDashboard {
    public static final By ACC_DASHBOARD_NAME = By.cssSelector("li.dropdown .dropdown-toggle");

    /**
     * Asserts if the validation message is contained when trying to login
     * with wrong credentials is as expected
     * @param expectedLoginName the expected validation message
     * @param messageOnFailure the message that will appear in your reports in case of failure
     */
    public static void verifyDashbordLoginName(String expectedLoginName, String messageOnFailure) {

        String actDashboardName = Browser.driver.findElement(ACC_DASHBOARD_NAME).getText();
        Assert.assertTrue(actDashboardName.contains(expectedLoginName),messageOnFailure);
    }
}
