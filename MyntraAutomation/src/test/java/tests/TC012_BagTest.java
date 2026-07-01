package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class TC012_BagTest extends BaseTest {

    @Test

    public void verifyBag() {

        HomePage home=new HomePage(driver);

        Assert.assertTrue(home.isBagDisplayed());

    }

}