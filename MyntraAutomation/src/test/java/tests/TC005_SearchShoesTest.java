package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.SearchPage;

public class TC005_SearchShoesTest extends BaseTest {

    @Test

    public void searchShoes() throws InterruptedException {

        SearchPage search=new SearchPage(driver);

        search.searchProduct("Shoes");

        Thread.sleep(3000);

        Assert.assertTrue(driver.getTitle().contains("Shoes"));

    }

}