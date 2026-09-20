package AQA_HW_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPage {
    private WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleText() {
        WebElement title = driver.findElement(By.cssSelector("[class='search__title']"));
        return title.getText();
    }

    public String getProductName(int productIndex) {
        WebElement product = getProductElements(productIndex);
        WebElement productName = product.findElement(By.cssSelector("[class='list-item__title-container m_b-5']"));
        return productName.getText();
    }

    public void clickOnProduct(int productIndex) {
        WebElement product = getProductElements(productIndex);
        WebElement productIcon = product.findElement(By.cssSelector("[class='list-item__photo']"));
        productIcon.click();

    }

    private WebElement getProductElements(int productIndex) {
        List<WebElement> iconElements = driver.findElements(By.cssSelector("div.list-item"));
        return iconElements.get(productIndex);
    }
}
