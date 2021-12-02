package adminarea.positive;

import core.BaseTest;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.AdminLogin;
import utils.Browser;

public class AdminLoginTests extends BaseTest {


    @Test
    public void successfulLogin() {
        AdminLogin.openPage();
        AdminLogin.login("admin","parola123!");
        AdminDashboard.verifyDashbordLoginName("Milen Strahinski","The name is not same");


    }


}
