package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.SearchPage;

public class TC006_SearchTShirtTest extends BaseTest {

    @Test

    public void searchTshirt() throws InterruptedException {

        SearchPage search=new SearchPage(driver);

        search.searchProduct("T Shirt");

        Thread.sleep(3000);

        Assert.assertTrue(driver.getTitle().contains("T"));

    }

}