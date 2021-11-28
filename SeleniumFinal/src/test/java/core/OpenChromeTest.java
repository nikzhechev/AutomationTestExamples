package core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Browser;

public class OpenChromeTest {

    @BeforeMethod
    public void setupChrome() {
        Browser.openBrowser();

    }

//    @AfterMethod
//    public void closeChrome(){
//        Browser.quit();
//    }

}
