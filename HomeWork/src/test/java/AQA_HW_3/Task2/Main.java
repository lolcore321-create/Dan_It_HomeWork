package AQA_HW_3.Task2;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        WebElement iconsField = driver.findElement(By.cssSelector("[data-eventlabel='Товари для геймерів']"));
        iconsField.click();
        sleep(5000);
        WebElement titleElements = driver.findElement(By.cssSelector("h1.title-page"));
        String pageTitleString = titleElements.getText();
        Assert.assertTrue(pageTitleString.contains("Товари для геймерів"));

        WebElement iconsElement = driver.findElement(By.cssSelector("[href='/ua/computer/videokarty/609215/'] .section-navigation__link-text"));
        iconsElement.click();
        sleep(5000);
        WebElement titleElements2 = driver.findElement(By.cssSelector("h1.catalog-title__main"));
        String pageTitle2String = titleElements2.getText();
        Assert.assertTrue(pageTitle2String.contains("Ігрові відеокарти NVIDIA"));
        driver.quit();
    }
}
