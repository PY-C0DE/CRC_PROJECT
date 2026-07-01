package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class TC010_ProfileTest extends BaseTest {

    @Test

    public void verifyProfile() {

        HomePage home=new HomePage(driver);

        Assert.assertTrue(home.isProfileDisplayed());

    }

}