package pages.adminarea;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Browser;

public class NavigationMenu {

    /**
     * This static locators for methods
     */
    public static final By NAVIGATION_CATALOG = By.id("menu-catalog");
    public static final By CATALOG_REVIEWS = By.xpath("//*[@id=\"collapse1\"]/li[9]");

    /**
     * This method navigate to Reviews page
     */
    public static void goToReviewsPage() {

        Browser.driver.findElement(NAVIGATION_CATALOG).click();
        WebDriverWait wait = new WebDriverWait(Browser.driver,5);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CATALOG_REVIEWS));
        Browser.driver.findElement(CATALOG_REVIEWS).click();

    }
}
