package pages.adminarea;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utils.Browser;

public class ReviewsPage {

    /**
     * This static locators for methods
     */
    public static final By SEARCH_INPUT_AUTHOR = By.id("input-author");
    public static final By SEARCH_INPUT_STATUS = By.id("input-status");
    public static final By BUTTON_FILTER = By.id("button-filter");
    public static final By ASSERT_FOR_AUTHOR = By.cssSelector("table.table-bordered tbody td:nth-child(3)");
    public static final By BUTTON_EDIT = By.cssSelector("td.text-right a.btn-primary");
    public static final By EDIT_INPUT_STATUS = By.id("input-status");
    public static final By EDIT_BUTTON_SAVE = By.cssSelector("div.pull-right button.btn-primary");
    public static final By ASSERT_FOR_SUCCESS_ENABLE_REVIEWS = By.cssSelector("div.alert-success");
    public static final By ELEMENT_FOR_DELETE = By.xpath("//*[@id=\"form-review\"]/div/table/tbody/tr/td[1]/input");
    public static final By BUTTON_DELETE = By.cssSelector("div.pull-right button.btn-danger");
    public static final By ASSERT_FOR_SUCCESS_DEL_REVIEWS = By.cssSelector("div.alert-success");

    /**
     * This method search reviews in filter for search
     *
     * @param authorName accept param of String for product Name
     * @param messagesOnFailure message that will appear in your reports in case of failure
     */
    public static void searchReviewsImac(String authorName, String messagesOnFailure) {
        Browser.driver.findElement(SEARCH_INPUT_AUTHOR).sendKeys(authorName);
        Select inputStatus = new Select(Browser.driver.findElement(SEARCH_INPUT_STATUS));
        inputStatus.selectByValue("0");
        Browser.driver.findElement(BUTTON_FILTER).click();

        Assert.assertTrue(Browser.driver.findElement(ASSERT_FOR_AUTHOR).getText().contains(authorName), messagesOnFailure);


    }

    /**
     * This method approve Reviews from disable change to enable status
     */
    public static void approveReviewsImac() {
        Browser.driver.findElement(BUTTON_EDIT).click();
        Select inputStatus = new Select(Browser.driver.findElement(EDIT_INPUT_STATUS));
        inputStatus.selectByValue("1");
        Browser.driver.findElement(EDIT_BUTTON_SAVE).click();

    }

    /**
     * This method Asserts if the validation message is contained when reviews is approved
     *
     * @param expMessages the expected validation message
     * @param messagesOnFailure message that will appear in your reports in case of failure
     */
    public static void verifyReviewsImacItem(String expMessages, String messagesOnFailure) {
        Assert.assertTrue(Browser.driver.findElement(ASSERT_FOR_SUCCESS_ENABLE_REVIEWS).getText().contains(expMessages), messagesOnFailure);
    }

    /**
     * This method search reviews by author
     *
     * @param authorName        accept String param enter the name of author
     * @param messagesOnFailure message that will appear in your reports in case of failure
     */
    public static void searchReviewsImacByAuthor(String authorName, String messagesOnFailure) {
        Browser.driver.findElement(SEARCH_INPUT_AUTHOR).sendKeys(authorName);

        Browser.driver.findElement(BUTTON_FILTER).click();

        Assert.assertTrue(Browser.driver.findElement(ASSERT_FOR_AUTHOR).getText().contains(authorName), messagesOnFailure);
    }

    /**
     * This method delete reviews from admin page
     */
    public static void deleteReviewsImac() {
        Browser.driver.findElement(ELEMENT_FOR_DELETE).click();
        Browser.driver.findElement(BUTTON_DELETE).click();
        Browser.driver.switchTo().alert().accept();


    }

    /**
     * This method Asserts if the validation message is contained when delete reviews
     * @param expMessages the expected validation message
     * @param messagesOnFailure message that will appear in your reports in case of failure
     */
    public static void verifyDeleteReviews(String expMessages, String messagesOnFailure) {
        Assert.assertTrue(Browser.driver.findElement(ASSERT_FOR_SUCCESS_DEL_REVIEWS).getText().contains(expMessages), messagesOnFailure);

    }
}
