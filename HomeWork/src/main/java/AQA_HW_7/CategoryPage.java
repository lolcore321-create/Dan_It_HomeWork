package AQA_HW_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryPage {
    private WebDriver driver;

    public CategoryPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public void clickCategory() {
        WebElement clickCategoryInternet = driver.findElement(By.cssSelector("[href='/ua/power/internet-bez-svitla/']"));
        clickCategoryInternet.click();
    }
}
