package adminarea.positive;

import core.LoginWhitAdmin;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.Attributes;

public class AddAttributesProcessorTest extends LoginWhitAdmin {

    @Test
    public void addAttributesProcessor() {

        Attributes.itemsAddProcessor("Core i7 vPro");
        Attributes.verifyAttributesAddItems("Success: You have modified attributes!", "The Attributes it`s not create ! ERROR");


    }

    @Test
    public void dellAttributesProcessor() {
        Attributes.dellAttributesProcessor("Core i7 vPro");
        Attributes.verifyDellAttributesProcessor("Success: You have modified attributes!", "The attributes is not delete from list");


    }

}
