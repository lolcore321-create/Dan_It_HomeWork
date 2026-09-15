package AQA_HW_5;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1));

        WebElement heartIcon = driver.findElement(By.cssSelector("[data-tracking-id='global-17']"));
        heartIcon.click();
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='profile-sidebar__section-content flex-column']")));

        WebElement closeBarClick = driver.findElement(By.cssSelector("[class='button-close popover-body__close-icon']"));
        closeBarClick.click();

        List<WebElement> heartBar = driver.findElements(By.cssSelector("[class='profile-sidebar__section-content flex-column']"));
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='profile-sidebar__section-content flex-column']")));

        Assert.assertEquals(1,heartBar.size());

        driver.quit();
    }
}
