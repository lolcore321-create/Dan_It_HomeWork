package AQA_HW_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage {
    private WebDriver driver;


    public ForgotPasswordPage(WebDriver driver) {
        this.driver =driver;
    }

    public String getPageTitleText(){
        WebElement title = driver.findElement(By.cssSelector("[class='h3 m_b-15']"));
        return title.getText();
    }

    public void inputField(String textToPassword) {
        WebElement fieldInputPassword = driver.findElement(By.cssSelector("[placeholder='E-mail або номер мобільного телефону']"));
        fieldInputPassword.sendKeys(textToPassword);
    }
    public void clickButtonTo() {
        WebElement buttonToSend = driver.findElement(By.cssSelector("[class*='btn btn--graphite']"));
        buttonToSend.click();
    }
    public String getTitleTextPagePassword() {
        WebElement titleText = driver.findElement(By.cssSelector("[class='error m_b-5']"));
        return titleText.getText();
    }
}
