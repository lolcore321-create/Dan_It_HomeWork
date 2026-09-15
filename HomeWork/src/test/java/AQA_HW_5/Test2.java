package AQA_HW_5;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='services-section__link link--black productReviews']")));
        WebElement checkReviews = driver.findElement(By.cssSelector("[class='services-section__link link--black productReviews']"));
        checkReviews.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='reviews__title m_b-15']")));
        WebElement titlePageReviews = driver.findElement(By.cssSelector("[class='reviews__title m_b-15']"));
        String titlePagesRev = titlePageReviews.getText();
        Assert.assertTrue(titlePagesRev.contains("Відгуки покупців"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='custom-select reviews-info__select']")));
        WebElement reviewFilter = driver.findElement(By.cssSelector("[class='custom-select reviews-info__select']"));
        reviewFilter.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(@title, 'Мережі')]")));
        WebElement searchForReview = driver.findElement(By.xpath("//p[contains(@title, 'Мережі')]"));
        searchForReview.click();

        driver.quit();

    }
}
