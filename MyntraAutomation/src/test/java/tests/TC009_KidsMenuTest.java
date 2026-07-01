package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class TC009_KidsMenuTest extends BaseTest {

    @Test

    public void verifyKidsMenu() {

        HomePage home=new HomePage(driver);

        Assert.assertTrue(home.isSearchDisplayed());

    }

}