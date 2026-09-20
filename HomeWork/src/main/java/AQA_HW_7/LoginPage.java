package AQA_HW_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterLogin(String login) {
        WebElement loginInput = driver.findElement(By.cssSelector("[type='text']"));
        loginInput.sendKeys(login);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(By.cssSelector("[type='password']"));
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
        submitButton.click();
    }

    public String getErrorMessageText() {
        WebElement error = driver.findElement(By.cssSelector("[class='error m_b-5']"));
        return error.getText();
    }

    public void clickForgotPasswordLink() {
        WebElement forgotPasswordLink = driver.findElement(By.linkText("[href='/ua/reminder/']"));
        forgotPasswordLink.click();
    }
}
