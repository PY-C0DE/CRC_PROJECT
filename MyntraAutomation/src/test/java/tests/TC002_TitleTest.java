package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class TC002_TitleTest extends BaseTest {

    @Test

    public void verifyTitle() {

        String title=driver.getTitle();

        Assert.assertTrue(title.contains("Myntra"));

    }

}