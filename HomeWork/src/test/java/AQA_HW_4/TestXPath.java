package AQA_HW_4;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;


public class TestXPath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        WebElement phoneCases = driver.findElement(By.xpath("//input[@type='text']"));
        String phoneIP = "IPhone 18 PRO MAX";
        sleep(3000);
        phoneCases.sendKeys(phoneIP);

        WebElement searchButtonField = driver.findElement(By.xpath("//button[@title='Поиск']"));
        searchButtonField.click();
        sleep(4000);

        WebElement searchTitle = driver.findElement(By.xpath("//div[@class='search__title']"));
        String pageTitleString = searchTitle.getText();
        Assert.assertTrue(pageTitleString.contains("IPhone 18 PRO MAX"));

        WebElement phoneIPhone = driver.findElement(By.xpath("//a[@href='/ua/mobile-mobilnye-telefony-i-smartfony/apple-iphone-18-pro-max-256gb-burgundy/' and @class='item-title text-md link link--black']"));
        phoneIPhone.click();
        sleep(2000);

        WebElement comparisonIPhone = driver.findElement(By.xpath("//button[@title='Додати товар у порівняння']"));
        comparisonIPhone.click();
        sleep(2000);

        WebElement comparison = driver.findElement(By.xpath("//div[contains(@class,'product-compare')]//div[contains(@class,'button__icon')]"));
        comparison.click();
        sleep(2000);

        WebElement comparisonDevises = driver.findElement(By.xpath("//div[@class='profile-sidebar__section-child-container']"));
        comparisonDevises.click();
        sleep(2000);

        WebElement error = driver.findElement(By.xpath("//span[@class='text-danger']"));
        String pageErrorTitle = error.getText();
        Assert.assertTrue(pageErrorTitle.contains("Помилка:"));
        driver.quit();

    }
}
