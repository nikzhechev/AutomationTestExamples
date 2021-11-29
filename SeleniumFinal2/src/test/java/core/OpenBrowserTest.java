package core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Browser;

public class OpenBrowserTest {

    @BeforeMethod
 public void setUpChrome(){
        Browser.openBrowser();

    }

@AfterMethod
    public void quitChrome(){
        Browser.closeDriver();
}
}
