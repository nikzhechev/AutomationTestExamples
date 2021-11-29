package core;

import org.testng.annotations.BeforeMethod;
import pages.adminarea.AdminPageLogin;

public class LoginWithAdmin extends  OpenBrowserTest {

    @BeforeMethod
    public void loginAdminPage() {
        AdminPageLogin.openPage();
        AdminPageLogin.login("admin13","parola123!");
    }
}
