package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Browser;

public class Attributes {
    /**
     * This static locators for methods
     */
    private static final By ELEMENT_CATALOG_MENU = By.cssSelector("#menu-catalog a.parent i.fa-tags");
    private static final By ELEMENT_ATTRIBUTES = By.cssSelector("#collapse1 a.parent");
    private static final By ELEMENT_ATTRIBUTES_DROPDOWN = By.xpath("//*[@id=\"collapse1-4\"]/li[1]/a");
    private static final By BUTTON_ADD_NEW = By.cssSelector("div.pull-right a.btn.btn-primary");
    private static final By FIELD_ATTRIBUTES_NAME = By.cssSelector("input.form-control[placeholder='Attribute Name']");
    private static final By SELECT_MENU = By.id("input-attribute-group");
    private static final By FIELD_SORT_ORDER = By.id("input-sort-order");
    private static final By BUTTON_SAVE_ATTRIBUTES = By.cssSelector("div.pull-right button.btn-primary");

    private static final By SUCCESS_ALERT_TEXT = By.cssSelector("div.alert.alert-success");


    private static final By ASSERT_ATTRIBUTES_ISADD = By.cssSelector("table.table-bordered tbody");
    private static final By SELECT_DELL_ATTRIBUTES = By.xpath("//*[@id=\"form-attribute\"]/div/table/tbody/tr[2]/td[1]/input");
    private static final By BUTTON_DELL = By.cssSelector("div.pull-right button.btn-danger");

    private static final By ALERT_DEL_MASSAGES = By.cssSelector("div.alert-success.alert-dismissible");
    private static final By ATTRIBUTES_ALERT_MASSAGES = By.cssSelector("div.text-danger");
    private static final By ATTRIBUTESNAME_ALERT_OVER64CHAR = By.cssSelector("div.required.has-error div.text-danger");


    /**
     * This method add Attributes items Processor in admin page shop
     *
     * @param attributesName enter name of attributes  you want to add
     */
    public static void itemsAddProcessor(String attributesName) {

        Browser.driver.findElement(ELEMENT_CATALOG_MENU).click();

        WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ELEMENT_ATTRIBUTES));

        Browser.driver.findElement(ELEMENT_ATTRIBUTES).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ELEMENT_ATTRIBUTES_DROPDOWN));

        Browser.driver.findElement(ELEMENT_ATTRIBUTES_DROPDOWN).click();

        Browser.driver.findElement(BUTTON_ADD_NEW).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(FIELD_ATTRIBUTES_NAME));
        Browser.driver.findElement(FIELD_ATTRIBUTES_NAME).sendKeys(attributesName);

        Select menuOptions = new Select(Browser.driver.findElement(SELECT_MENU));
        menuOptions.selectByValue("6");

        Browser.driver.findElement(FIELD_SORT_ORDER).sendKeys("5");

        Browser.driver.findElement(BUTTON_SAVE_ATTRIBUTES).click();


    }

    /**
     * Asserts if the validation message is contained when trying to create Attributes
     * processor
     *
     * @param expectedMassage  the expected validation message
     * @param massageOnFailure the message that will appear in your reports in case of failure
     */
    public static void verifyAttributesAddItems(String expectedMassage, String massageOnFailure) {
        String actValidateText = Browser.driver.findElement(SUCCESS_ALERT_TEXT).getText();

        Assert.assertTrue(actValidateText.contains(expectedMassage), massageOnFailure);

    }


    /**
     * This method deletes the created attribute from the previous method
     *
     * @param expectNameAtt name of attributes you like to delete
     */
    public static void dellAttributesProcessor(String expectNameAtt) {
        Browser.driver.findElement(ELEMENT_CATALOG_MENU).click();

        WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ELEMENT_ATTRIBUTES));

        Browser.driver.findElement(ELEMENT_ATTRIBUTES).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ELEMENT_ATTRIBUTES_DROPDOWN));
        Browser.driver.findElement(ELEMENT_ATTRIBUTES_DROPDOWN).click();

        String attributesProcessorText = Browser.driver.findElement(ASSERT_ATTRIBUTES_ISADD).getText();

        Assert.assertTrue(attributesProcessorText.contains(expectNameAtt), "Attributes it`s not in list ! Or ERROR !");
        Browser.driver.findElement(SELECT_DELL_ATTRIBUTES).click();
        Browser.driver.findElement(BUTTON_DELL).click();
        Browser.driver.switchTo().alert().accept();


    }

    /**
     * Asserts if the validation message is contained when trying to delete Attributes
     * processor from previous method
     *
     * @param expectedMassage  the expected validation message
     * @param massageOnFailure the message that will appear in your reports in case of failure
     */
    public static void verifyDellAttributesProcessor(String expectedMassage, String massageOnFailure) {
        String actValidateText = Browser.driver.findElement(ALERT_DEL_MASSAGES).getText();

        Assert.assertTrue(actValidateText.contains(expectedMassage), massageOnFailure);
    }

    /**
     * This method is try to create Attributes without select group of attributes
     *
     * @param attributesName name of attributes you like to write
     */
    public static void notAddProcessor(String attributesName) {
        Browser.driver.findElement(ELEMENT_CATALOG_MENU).click();

        WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ELEMENT_ATTRIBUTES));

        Browser.driver.findElement(ELEMENT_ATTRIBUTES).click();

        Browser.driver.findElement(ELEMENT_ATTRIBUTES_DROPDOWN).click();

        Browser.driver.findElement(BUTTON_ADD_NEW).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(FIELD_ATTRIBUTES_NAME));
        Browser.driver.findElement(FIELD_ATTRIBUTES_NAME).sendKeys(attributesName);


        Browser.driver.findElement(FIELD_SORT_ORDER).sendKeys("5");

        Browser.driver.findElement(BUTTON_SAVE_ATTRIBUTES).click();
    }

    /**
     * Assert validation massages is contained when create attributes without selected group
     *
     * @param expectedMassages  expected validation massage
     * @param massagesOnFailure the message that will appear in your reports in case of failure
     */
    public static void verifyNotCreateAttributes(String expectedMassages, String massagesOnFailure) {
        String actValidateMassages = Browser.driver.findElement(ATTRIBUTES_ALERT_MASSAGES).getText();

        Assert.assertTrue(actValidateMassages.contains(expectedMassages), massagesOnFailure);

    }

    /**
     * This method is try to create Attributes with over 64 character enter in Attributes name
     *
     * @param attributesName name of attributes you like to write whit over 64 character
     */
    public static void addAttributesOver64Char(String attributesName) {
        Browser.driver.findElement(ELEMENT_CATALOG_MENU).click();

        WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ELEMENT_ATTRIBUTES));

        Browser.driver.findElement(ELEMENT_ATTRIBUTES).click();

        Browser.driver.findElement(ELEMENT_ATTRIBUTES_DROPDOWN).click();

        Browser.driver.findElement(BUTTON_ADD_NEW).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(FIELD_ATTRIBUTES_NAME));
        Browser.driver.findElement(FIELD_ATTRIBUTES_NAME).sendKeys(attributesName);

        Select menuOptions = new Select(Browser.driver.findElement(SELECT_MENU));
        menuOptions.selectByValue("6");

        Browser.driver.findElement(FIELD_SORT_ORDER).sendKeys("5");

        Browser.driver.findElement(BUTTON_SAVE_ATTRIBUTES).click();

    }

    /**
     * Assert validation massages is contained when create attributes with over 64 character in name
     *
     * @param expectedMassage   expected validation massage
     * @param massagesOnFailure the message that will appear in your reports in case of failure
     */
    public static void verifyCantOver64CharAttributesName(String expectedMassage, String massagesOnFailure) {

        String actValidateOver64CharEnter = Browser.driver.findElement(ATTRIBUTESNAME_ALERT_OVER64CHAR).getText();

        Assert.assertTrue(actValidateOver64CharEnter.contains(expectedMassage), massagesOnFailure);
    }
}
