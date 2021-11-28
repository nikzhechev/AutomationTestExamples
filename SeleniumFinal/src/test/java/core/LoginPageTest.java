package core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Browser;

public class LoginPageTest {

    @BeforeMethod
    public void setupChrome() {
        Browser.openPage();

    }

//    @AfterMethod
//    public void closeChrome(){
//        Browser.quit();
//    }

}
