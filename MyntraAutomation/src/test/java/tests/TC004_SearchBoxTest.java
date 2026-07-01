package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class TC004_SearchBoxTest extends BaseTest {

    @Test

    public void verifySearchBox() {

        HomePage home=new HomePage(driver);

        Assert.assertTrue(home.isSearchDisplayed());

    }

}