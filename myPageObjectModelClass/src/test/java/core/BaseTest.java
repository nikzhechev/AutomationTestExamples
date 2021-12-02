package core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import pages.AdminLogin;
import utils.Browser;

public class BaseTest {

    @BeforeMethod
    public void setup() {
        Browser.openBrowser();


    }

//    @AfterMethod
//    public void closeChrome() {
//        Browser.quit();
//    }
}
