package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class TC003_URLTest extends BaseTest {

    @Test

    public void verifyURL() {

        Assert.assertTrue(driver.getCurrentUrl().contains("myntra"));

    }

}