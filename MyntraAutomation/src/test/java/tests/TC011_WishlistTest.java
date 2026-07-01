package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class TC011_WishlistTest extends BaseTest {

    @Test

    public void verifyWishlist() {

        HomePage home=new HomePage(driver);

        Assert.assertTrue(home.isWishlistDisplayed());

    }

}