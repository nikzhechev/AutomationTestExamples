package positive;

import core.LoginAdmin;
import core.LoginPageTest;
import org.testng.annotations.Test;
import pages.AddNewGiftVoucher;
import pages.AdminLogin;
import pages.GiftVoucher;
import pages.NavigationMenu;

public class AddGiftVouchers extends LoginAdmin {

@Test
    public void addGiftVoucher(){
    NavigationMenu.goToGiftVoucher();
    GiftVoucher.checkForExistsGiftVoucherIfExistsDell("Test1Code");
    AddNewGiftVoucher.createNewGiftVoucher("Test1Code","Nikolay","Iveto","50");
    AddNewGiftVoucher.verifyGiftVoucherAdd("Success: You have modified vouchers!","HAVE A BUG!!");
}
}
