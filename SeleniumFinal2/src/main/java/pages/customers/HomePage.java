package pages.customers;

import org.openqa.selenium.By;
import utils.Browser;

public class HomePage {
    /**
     * This static locators for methods
     */
    public static final By DROPDOWN_DESKTOPS = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]");
    public static final By DROPDOWN_MAC = By.xpath("//*[@href=\"http://shop.pragmatic.bg/index.php?route=product/category&path=20_27\"]");

    /**
     * This method open the home page
     */
    public static void openPage() {
        Browser.driver.get("http://shop.pragmatic.bg/");
    }

    /**
     * This method navigate to the Mac Page
     */
    public static void goToMacReview() {
        Browser.driver.findElement(DROPDOWN_DESKTOPS).click();
        Browser.driver.findElement(DROPDOWN_MAC).click();

    }
}
