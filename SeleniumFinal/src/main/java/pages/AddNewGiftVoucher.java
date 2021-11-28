package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class AddNewGiftVoucher {

    /**
     * This static locators for methods
     */
    public static final By NAME_CODE_VOUCHER = By.id("input-code");
    public static final By INPUT_FROM_NAME = By.id("input-from-name");
    public static final By INPUT_FROM_EMAIL = By.id("input-from-email");
    public static final By INPUT_TO_NAME = By.id("input-to-name");
    public static final By INPUT_TO_EMAIL = By.id("input-to-email");
    public static final By INPUT_TO_AMOUNT = By.id("input-amount");
    public static final By BUTTON_SAVE_GIFT = By.cssSelector("div.pull-right button.btn-primary");
    public static final By ALER_SUCCESS_CREATE_GIFT = By.cssSelector("div.alert-success");

    /**
     *  This method create new Gift Voucher
     * @param codeName accept String param for name of Code
     * @param fromName accept String param from Name
     * @param toName accept String param to Name
     * @param amount accept String param for amount
     */
    public static void createNewGiftVoucher(String codeName, String fromName, String toName, String amount) {
        Browser.driver.findElement(NAME_CODE_VOUCHER).sendKeys(codeName);

        Browser.driver.findElement(INPUT_FROM_NAME).sendKeys(fromName);

        String randomEmail = RandomStringUtils.randomAlphanumeric(8) + "@example.com";

        Browser.driver.findElement(INPUT_FROM_EMAIL).sendKeys(randomEmail);
        Browser.driver.findElement(INPUT_TO_NAME).sendKeys(toName);

        Browser.driver.findElement(INPUT_TO_EMAIL).sendKeys(randomEmail);
        Browser.driver.findElement(INPUT_TO_AMOUNT).sendKeys(amount);
        Browser.driver.findElement(BUTTON_SAVE_GIFT).click();
    }

    /**
     *Asserts if the validation message is contained when trying to create New Gift Voucher
     * @param expMessages the expected validation message
     * @param messagesOnFailure he message that will appear in your reports in case of failure
     */
    public static void verifyGiftVoucherAdd(String expMessages, String messagesOnFailure) {
        Assert.assertTrue(Browser.driver.findElement(ALER_SUCCESS_CREATE_GIFT).getText().contains(expMessages),messagesOnFailure);
    }
}
