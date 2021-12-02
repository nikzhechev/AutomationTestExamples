package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser {

   public static WebDriver driver;

    /**
     * Open Chrome Browser instance and sets Implicit wait 10 sec
     */

    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }

    /**
     * Quits the browser and all opened windows
     */
    public static void quit() {
        driver.quit();
    }
}
