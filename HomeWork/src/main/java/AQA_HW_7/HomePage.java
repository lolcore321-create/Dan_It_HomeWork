package AQA_HW_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchTextEnter(String textToSearch) {
        WebElement searchField = driver.findElement(By.cssSelector("[type='text']"));
        searchField.sendKeys(textToSearch);
    }

    public void clickToButton() {
        WebElement searchButton = driver.findElement(By.cssSelector("[class*='search__btn']"));
        searchButton.click();
    }
    public void clickAccountIcon() {
        WebElement accountIcon = driver.findElement(By.cssSelector("[href='/ua/login/']"));
        accountIcon.click();
    }
    public void clickAllCategory(){
        WebElement clickCategory = driver.findElement(By.cssSelector("[class='button-menu-main ']"));
        clickCategory.click();
    }
    public void clickAllCategoryButton() {
        WebElement clickAllCategoryElements = driver.findElement(By.cssSelector("[href='/ua/catalog/']"));
        clickAllCategoryElements.click();
    }
}
