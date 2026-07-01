package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    By logo=By.className("myntraweb-sprite");

    By profile=By.xpath("//span[text()='Profile']");

    By wishlist=By.xpath("//span[text()='Wishlist']");

    By bag=By.xpath("//span[text()='Bag']");

    By men=By.xpath("//a[text()='Men']");

    By women=By.xpath("//a[text()='Women']");

    By kids=By.xpath("//a[text()='Kids']");

    By searchBox=By.className("desktop-searchBar");

    public boolean isLogoDisplayed() {

        return driver.findElement(logo).isDisplayed();

    }

    public boolean isProfileDisplayed() {

        return driver.findElement(profile).isDisplayed();

    }

    public boolean isWishlistDisplayed() {

        return driver.findElement(wishlist).isDisplayed();

    }

    public boolean isBagDisplayed() {

        return driver.findElement(bag).isDisplayed();

    }

    public boolean isSearchDisplayed() {

        return driver.findElement(searchBox).isDisplayed();

    }

    public void clickMen() {

        driver.findElement(men).click();

    }

    public void clickWomen() {

        driver.findElement(women).click();

    }

    public void clickKids() {

        driver.findElement(kids).click();

    }

}