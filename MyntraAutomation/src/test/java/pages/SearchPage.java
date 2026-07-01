package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {

        this.driver=driver;

    }

    By search=By.className("desktop-searchBar");

    public void searchProduct(String product) {

        driver.findElement(search).sendKeys(product);

        driver.findElement(search).sendKeys(Keys.ENTER);

    }

}