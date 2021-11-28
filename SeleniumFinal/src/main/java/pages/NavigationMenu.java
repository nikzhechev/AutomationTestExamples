package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Browser;

public class NavigationMenu {

    /**
     * This static locators for methods
     */
    public static final By MENU_SALE = By.id("menu-sale");
    public static final By DROPDOWN_GIFTVOUCHER = By.cssSelector("#collapse4 a.parent.collapsed");
    public static final By DROPDOWN_GIFTVOUCHER_FIRST = By.xpath("//*[@id=\"collapse4-3\"]/li[1]/a");

    /**
     * This method navigate to GiftVoucher page
     */
    public static void goToGiftVoucher()  {

        WebDriverWait wait = new WebDriverWait(Browser.driver,5);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MENU_SALE));

        Browser.driver.findElement(MENU_SALE).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DROPDOWN_GIFTVOUCHER));
        Browser.driver.findElement(DROPDOWN_GIFTVOUCHER).click();

        Browser.driver.findElement(DROPDOWN_GIFTVOUCHER_FIRST).click();





    }


}
