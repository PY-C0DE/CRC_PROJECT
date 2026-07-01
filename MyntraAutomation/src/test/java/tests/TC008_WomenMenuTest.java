package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class TC008_WomenMenuTest extends BaseTest {

    @Test

    public void verifyWomenMenu() {

        HomePage home=new HomePage(driver);

        Assert.assertTrue(home.isSearchDisplayed());

    }

}