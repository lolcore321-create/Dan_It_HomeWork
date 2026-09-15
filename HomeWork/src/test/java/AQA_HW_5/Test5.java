package AQA_HW_5;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));


        WebElement buyGuide = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-tracking-id='global-24']")));
        buyGuide.click();

        WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder*='Холодильники']")));
        String search = "Монітори";
        searchField.sendKeys(search);

        WebElement searchClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='autosuggest__results-item']")));
        searchClick.click();

        WebElement pageTitleString = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='catalog-guide__title text-bold']")));
        String pageTitleSearch = pageTitleString.getText();
        Assert.assertTrue(pageTitleSearch.contains("Монітори"));

        driver.quit();
    }
}
