package core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import pages.AdminLogin;
import utils.Browser;

public class LoginWhitAdmin extends BaseTest {

    @BeforeMethod
    public void loginAdminPage() {

        AdminLogin.openPage();
        AdminLogin.login("admin","parola123!");

    }

//    @AfterMethod
//    public void closeChrome() {
//        Browser.quit();
//    }
}
