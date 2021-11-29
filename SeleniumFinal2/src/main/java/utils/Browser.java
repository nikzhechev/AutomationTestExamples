package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    public static WebDriver driver;


    /**
     * Open Chrome Browser driver
     */
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver","D:\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    /**
     * Quits the browser and all opened windows
     */
    public static void closeDriver(){
        driver.quit();
    }
}
