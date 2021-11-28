package positive;

import core.LoginAdmin;
import org.testng.annotations.Test;
import pages.AddNewGiftVoucher;
import pages.GiftVoucher;
import pages.NavigationMenu;

public class AddGiftVouchers extends LoginAdmin {

@Test
    public void addGiftVoucher(){
    NavigationMenu.goToGiftVoucher();
    GiftVoucher.checkForExistsGiftVoucherIfExistsDell("code1");
    AddNewGiftVoucher.createNewGiftVoucher("code1","Nikolay","Iveto","50");
    AddNewGiftVoucher.verifyGiftVoucherAdd("Success: You have modified vouchers!","HAVE A BUG!!");
}
}
