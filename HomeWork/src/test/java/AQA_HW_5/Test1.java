package AQA_HW_5;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        WebElement choosingLego = driver.findElement(By.cssSelector("[data-eventlabel='LEGO']"));
        choosingLego.click();

        WebElement titleStringPage = driver.findElement(By.cssSelector("[class*='title-page']"));
        String pageTitle = titleStringPage.getText();
        Assert.assertTrue(pageTitle.contains("Дитячі конструктори LEGO"));

        WebElement bigLego = driver.findElement(By.xpath("//div[@class='section-navigation__link-text' and contains(text(), '18+')]"));
        bigLego.click();

        WebElement titleLegoStringPage = driver.findElement(By.cssSelector("[class='catalog-title__main']"));
        String pageLegoTitle = titleLegoStringPage.getText();
        Assert.assertTrue(pageLegoTitle.contains("Конструктор для дорослих"));

        WebElement formatIconsFilter = driver.findElement(By.cssSelector("[class='cards-format-switch__item']"));
        formatIconsFilter.click();

        WebElement filtersPage = driver.findElement(By.xpath("//div[@class='select__field' and contains(text(), 'популярністю')]"));
        filtersPage.click();

        WebElement sortByPrice = driver.findElement(By.xpath("//div[contains(@class, 'select__dropdown-item') and contains(normalize-space(.), 'зменшенням')]"));
        sortByPrice.click();

        WebElement sortingByPrice = driver.findElement(By.xpath("//div[contains(@class, 'select__dropdown-item') and contains(normalize-space(.), 'зменшенням')]"));
        String titleFilter = sortingByPrice.getText();
        Assert.assertTrue(titleFilter.contains("зменшенням ціни"));

        driver.quit();

    }
}
