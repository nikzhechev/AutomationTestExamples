package adminarea.positive;

import core.LoginWithAdmin;
import org.testng.annotations.Test;
import pages.adminarea.NavigationMenu;
import pages.adminarea.ReviewsPage;

public class DeleteReviews extends LoginWithAdmin {
    @Test

    public void deleteReviewsImac(){
        NavigationMenu.goToReviewsPage();
        ReviewsPage.searchReviewsImacByAuthor("Nikolay","Don`t have this author or have BUG !");
        ReviewsPage.deleteReviewsImac();
        ReviewsPage.verifyDeleteReviews("Success: You have modified reviews!","It`s not delete ! OR HAVE A BUG!");
    }

}
