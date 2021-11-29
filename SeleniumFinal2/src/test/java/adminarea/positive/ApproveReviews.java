package adminarea.positive;

import core.LoginWithAdmin;
import org.testng.annotations.Test;
import pages.adminarea.NavigationMenu;
import pages.adminarea.ReviewsPage;

public class ApproveReviews extends LoginWithAdmin {


    @Test
    public void viewAndApproveReviews() {

        NavigationMenu.goToReviewsPage();
        ReviewsPage.searchReviewsImac("Nikolay","Don`t have this author or have BUG !");
        ReviewsPage.approveReviewsImac();
        ReviewsPage.verifyReviewsImacItem("Success: You have modified reviews!","HAVE BUG!");

    }
}