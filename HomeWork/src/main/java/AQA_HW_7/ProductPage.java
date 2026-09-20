package AQA_HW_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getProductPage() {
        WebElement titleElements = driver.findElement(By.cssSelector("[class='title__main']"));
        return titleElements.getText();
    }
    public  String getCategoryTitleText() {
        WebElement title = driver.findElement(By.cssSelector("[class*='title-page']"));
        return title.getText();
    }

}
