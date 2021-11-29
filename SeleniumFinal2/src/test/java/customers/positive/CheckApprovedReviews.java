package customers.positive;

import core.OpenBrowserTest;
import org.testng.annotations.Test;
import pages.customers.HomePage;
import pages.customers.MacPage;

public class CheckApprovedReviews extends OpenBrowserTest {

    @Test
    public  void checkApprovedImacReviews() {
        HomePage.openPage();
        HomePage.goToMacReview();
        MacPage.verifyReviewsIMackIsAprroved("The product came fast and is very good I like it!","HAVE BUG!");


    }

}
