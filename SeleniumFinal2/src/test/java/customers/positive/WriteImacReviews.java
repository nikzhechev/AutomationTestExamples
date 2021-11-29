package customers.positive;

import core.OpenBrowserTest;
import org.testng.annotations.Test;
import pages.customers.HomePage;
import pages.customers.MacPage;

public class WriteImacReviews extends OpenBrowserTest {
    @Test
    public static void writeReviewsForImac() {

        HomePage.openPage();
        HomePage.goToMacReview();
        MacPage.AddImacReviews("Nikolay", "The product came fast and is very good I like it!");
        MacPage.verifyReviewCreate("Thank you for your review. It has been submitted to the webmaster for approval.", "HAVE A BUGG!!");


    }
}
