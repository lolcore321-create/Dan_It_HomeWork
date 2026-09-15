package AQA_HW_5;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class Test3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


        WebElement bonusProgram = driver.findElement(By.cssSelector("[data-tracking-id='global-23']"));
        bonusProgram.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class*='loyalty-header__title ']")));
        WebElement pageTitleBonus = driver.findElement(By.cssSelector("[class*='loyalty-header__title ']"));
        String pageTitleStringProgram = pageTitleBonus.getText();
        Assert.assertTrue(pageTitleStringProgram.contains("Бонусна програма"));

        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500));

        List<WebElement> gifts = fluentWait.until(ExpectedConditions
                .numberOfElementsToBe(By.cssSelector("[class='gifts__info-box']"), 3));
        Assert.assertEquals(3, gifts.size());

        driver.quit();
    }
}
