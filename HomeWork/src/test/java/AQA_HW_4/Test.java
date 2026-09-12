package AQA_HW_4;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;


public class Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        WebElement mainManu = driver.findElement(By.cssSelector("[class='button-menu-main ']"));
        mainManu.click();
        sleep(2000);

        WebElement menuItem = driver.findElement(By.cssSelector("[data-id='193']"));
        menuItem.click();
        sleep(2000);

        WebElement titleElement = driver.findElement(By.cssSelector("h1[class*='title-page']"));
        String pageTitleString = titleElement.getText();
        Assert.assertTrue(pageTitleString.contains("Комп'ютери, Мережі"));

        WebElement deviceIcon = driver.findElement(By.cssSelector("[href='/ua/computer/nastolnye-kompyutery/14830/']"));
        deviceIcon.click();
        sleep(2000);

        WebElement titlePcElement = driver.findElement(By.cssSelector("[class='catalog-title__main']"));
        String pageTitleComputerString = titlePcElement.getText();
        Assert.assertTrue(pageTitleComputerString.contains("Ігрові комп'ютери"));
        driver.quit();

    }
}
