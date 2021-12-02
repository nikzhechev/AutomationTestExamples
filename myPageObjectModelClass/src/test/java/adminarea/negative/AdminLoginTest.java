package adminarea.negative;

import core.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AdminLogin;
import utils.Browser;

public class AdminLoginTest extends BaseTest {


    @Test
    public void unsuccLogin(){
        AdminLogin.openPage();

        AdminLogin.login("Nikolay","parola1234");
        AdminLogin.verifyValidationMessages("No match for Username and/or Password.","Text is not present ! Bug !");


    }

}
