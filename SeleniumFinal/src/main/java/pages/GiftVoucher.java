package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Browser;

public class GiftVoucher {

    /**
     * This static locators for methods
     */
    public static final By ELEMENT_TO_DELL = By.cssSelector("table.table-bordered tbody td.text-left");
    public static final By NO_ELEMENT_PRESENT = By.cssSelector("table.table-bordered tbody td.text-center");
    public static final By INPUT_CHECK = By.xpath("//*[@id=\"form-voucher\"]/div/table/tbody/tr/td[1]/input");
    public static final By BUTTON_DELL = By.cssSelector("div.pull-right button.btn-danger");
    public static final By SUCCESS_MESSAGES = By.cssSelector("#content div.alert-success");
    public static final By ENTER_PAGE_ADDNEWGIFT = By.cssSelector("div.pull-right a.btn-primary");

    /**
     * This method check for exists GiftVoucher if voucher with this name is
     * exists he delete voucher
     *
     * @param nameGiftVoucher accept String for name of GiftVoucher
     */
    public static void checkForExistsGiftVoucherIfExistsDell(String nameGiftVoucher) {
        if (isElementPresent(INPUT_CHECK)) {
            Assert.assertTrue(Browser.driver.findElement(ELEMENT_TO_DELL).getText().contains(nameGiftVoucher));
            WebElement input = Browser.driver.findElement(INPUT_CHECK);
            input.click();
            Browser.driver.findElement(BUTTON_DELL).click();
            Browser.driver.switchTo().alert().accept();
            Assert.assertTrue(Browser.driver.findElement(SUCCESS_MESSAGES).getText().contains("Success: You have modified vouchers!"));


        } else {
            Assert.assertTrue(Browser.driver.findElement(NO_ELEMENT_PRESENT).getText().contains("No results!"));
            System.out.println("The Gift Voucher is not Create ");
        }

        Browser.driver.findElement(ENTER_PAGE_ADDNEWGIFT).click();


    }

    /**
     * This methode is helper for finding Element it exists on the page
     * @param by accept param of Xpath, cssSelector , name , ID , className  nad other
     * @return true or false
     */
    static boolean isElementPresent(By by) {
        try {
            Browser.driver.findElement(by);
            return true;
        } catch (NoSuchElementException var3) {
            return false;
        }
    }
}
