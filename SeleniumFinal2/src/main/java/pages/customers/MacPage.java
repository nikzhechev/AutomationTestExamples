package pages.customers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Browser;

public class MacPage {
    /**
     * This static locators for all methods
     */
    public static final By ENTER_IMAC_ITEM = By.cssSelector("div.image img.img-responsive");
    public static final By WAIT_IMG_VIEW = By.cssSelector("ul.thumbnails");
    public static final By ELEMENT_REVIEWS = By.cssSelector("ul.nav-tabs a[href*='#tab-review']");
    public static final By INPUT_NAME = By.id("input-name");
    public static final By INPUT_REVIEWS = By.id("input-review");
    public static final By INPUT_RAITING_BUTTON = By.cssSelector("div.col-sm-12 input[value*='3']");
    public static final By BUTTON_CONTINUE = By.id("button-review");
    public static final By ALERT_MESSAGES = By.cssSelector("div.alert-success");
    public static final By ASSERT_REVIEWS_APPROVED = By.cssSelector("table.table-striped tbody tr td p");

    /**
     * This method create Reviews in IMac items
     * @param yourName accept param of String enter your  Name
     * @param yourReviews accept param of String enter your reviews comments
     */
    public static void AddImacReviews(String yourName, String yourReviews) {
        Browser.driver.findElement(ENTER_IMAC_ITEM).click();

        WebDriverWait wait = new WebDriverWait(Browser.driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(WAIT_IMG_VIEW));

        Browser.driver.findElement(ELEMENT_REVIEWS).click();
        Browser.driver.findElement(INPUT_NAME).sendKeys(yourName);
        Browser.driver.findElement(INPUT_REVIEWS).sendKeys(yourReviews);

        WebElement raitingButton = Browser.driver.findElement(INPUT_RAITING_BUTTON);
        if (!raitingButton.isSelected())
            raitingButton.click();
        Browser.driver.findElement(BUTTON_CONTINUE).click();


    }

    /**
     * This method is asserts if the validation message is contained when trying to create New Reviews for IMac item
     * @param expMessages the expected validation message
     * @param failureOnMessages  message that will appear in your reports in case of failure
     */
    public static void verifyReviewCreate(String expMessages, String failureOnMessages) {

        WebDriverWait wait = new WebDriverWait(Browser.driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ALERT_MESSAGES));
        Assert.assertTrue(Browser.driver.findElement(ALERT_MESSAGES).getText().contains(expMessages), failureOnMessages);
    }

    /**
     * This method Asserts if the validation message is contained for verify Reviews
     * @param textReviews the expected validation message
     * @param messagesOnFailure message that will appear in your reports in case of failure
     */
    public static void verifyReviewsIMackIsAprroved(String textReviews, String messagesOnFailure) {
        Browser.driver.findElement(ENTER_IMAC_ITEM).click();

        WebDriverWait wait = new WebDriverWait(Browser.driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(WAIT_IMG_VIEW));
        Browser.driver.findElement(ELEMENT_REVIEWS).click();
        Assert.assertTrue(Browser.driver.findElement(ASSERT_REVIEWS_APPROVED).getText().contains(textReviews),messagesOnFailure);

    }
}
