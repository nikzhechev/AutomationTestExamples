package adminarea.negative;

import core.LoginWhitAdmin;
import org.testng.annotations.Test;
import pages.Attributes;

public class AddAttributesProcessorTest extends LoginWhitAdmin {

    @Test
    public void notCreateProcessorAttributes(){
        Attributes.notAddProcessor("Core 8 VPro");
        Attributes.verifyNotCreateAttributes("Attribute Group Required!","You have not passed negative Test Case ! ERORR!");

    }

    @Test
    public void charOver64toCreateAttributes(){
        Attributes.addAttributesOver64Char("over64CharEnterFieldAttributesNameover64CharEnterFieldAttributesN");
        Attributes.verifyCantOver64CharAttributesName("Attribute Name must be between 1 and 64 characters!","You have not passed negative Test Case ! ERORR !");
    }
}
