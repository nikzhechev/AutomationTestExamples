package core;

import org.testng.annotations.BeforeMethod;
import pages.AdminDashbord;
import pages.AdminLogin;

public class LoginAdmin extends OpenChromeTest {

    @BeforeMethod
    public void loginAdminPage() {


        AdminLogin.openPage();
        AdminLogin.login("admin13", "parola123!");
        AdminDashbord.verifyDashbordLoginName("AdminQAC22_First AdminQAC22_Last","Not the same admin user");


    }


}
