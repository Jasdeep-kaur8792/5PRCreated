package ComputerSection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Apparel {
    WebDriver driver;
    WebDriverWait wait;

    By clickOnTopMenuApparel = By.xpath("//a[contains(text(),'Apparel')][1]");
    By clickOnShoes = By.xpath("(//a[@title='Show products in category Shoes'])[1]");
    By clickOnWishList = By.xpath("//div[@class='product-item']");
    By clickOnSelectSizeOfShoes = By.xpath("//dd[@id='product_attribute_input_9']");
    By selectColour = By.xpath("//span[@class='attribute-square'][1]");
    By clickOnAddWishList = By.xpath("//div[@class='add-to-wishlist']");
    By clickOnTopWishList = By.xpath("//span[@class='wishlist-label']");
    By clickOnLogOutButton = By.xpath("//a[@class='ico-logout']");


    public Apparel(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }


    public void fromClickOnTopMenuApparel() throws InterruptedException {
        driver.findElement(clickOnTopMenuApparel).click();
        driver.findElement(clickOnShoes).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='product-item']"))));
        driver.findElement(clickOnWishList).click();
        // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//select[@class='valid']"))));
        driver.findElement(clickOnSelectSizeOfShoes).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//option[contains(text(),'8')]")).click();
        driver.findElement(selectColour).click();
        driver.findElement(clickOnAddWishList).click();
        driver.findElement(clickOnTopWishList).click();
        driver.findElement(clickOnLogOutButton).click();
    }
}
