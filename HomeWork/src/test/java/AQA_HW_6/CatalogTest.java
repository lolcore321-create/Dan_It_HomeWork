package AQA_HW_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CatalogTest extends BaseTest {
    @Test(groups = {"positive"})
    public void catalogView() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement catalogButton = getDriver().findElement(By.cssSelector("[class='button-menu-main ']"));
        catalogButton.click();

        WebElement allCatalogButton = getDriver().findElement(By.cssSelector("[href='/ua/catalog/']"));
        allCatalogButton.click();

        WebElement catalogSmartphone = getDriver().findElement(By.cssSelector("[href='/ua/mobile/telefony-i-garnitury/']"));
        catalogSmartphone.click();

        WebElement pageTitleSmart = getDriver().findElement(By.cssSelector("[class*='title-page']"));
        String titleSmart = pageTitleSmart.getText();
        Assert.assertTrue(titleSmart.contains("Смартфони та мобільні телефони"));

        WebElement smartWatchView = getDriver().findElement(By.cssSelector("[href='/ua/mobile/smart-chasy-i-fitnes-braslety/']"));
        smartWatchView.click();

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("[class='title-page flex middle-xs section-title']"), "Смарт-годинники"));

        WebElement pageTitleView = getDriver().findElement(By.cssSelector("[class='title-page flex middle-xs section-title']"));
        String pageTitleWatch = pageTitleView.getText();
        Assert.assertTrue(pageTitleWatch.contains("Смарт-годинники і фітнес-браслети"));

    }

    @Test(groups = {"positive"})
    public void incorrectFilter() {
        WebElement autoMoto = getDriver().findElement(By.cssSelector("[data-eventlabel='Авто і Мото']"));
        autoMoto.click();

        WebElement carTires = getDriver().findElement(By.cssSelector(".catalog-links a[href='/ua/auto/avtoshiny-i-motoshiny/']"));
        carTires.click();

        WebElement pageTitleTires = getDriver().findElement(By.cssSelector(".catalog-title__main"));
        String titlePageTires = pageTitleTires.getText();
        Assert.assertTrue(titlePageTires.contains("Шини"));
    }
}
