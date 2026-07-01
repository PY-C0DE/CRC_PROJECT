package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class TC001_HomePageTest extends BaseTest {

    @Test
    public void verifyHomePage() {

        Assert.assertTrue(driver.getTitle().contains("Myntra"));

    }

}