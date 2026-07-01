package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class TC007_MenMenuTest extends BaseTest {

    @Test

    public void verifyMenMenu() {

        HomePage home=new HomePage(driver);

        Assert.assertTrue(home.isSearchDisplayed());

    }

}