package AQA_HW_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsersTests extends BaseTest {
    @Test(dataProvider = "getUserRegisterData", dataProviderClass = DataProvide.class, groups = {"negative"})
    public void logInAccount(String userWord) {
        WebElement accountIcon = getDriver().findElement(By.cssSelector("[href='/ua/login/']"));
        accountIcon.click();

        WebElement forgoPassword = getDriver().findElement(By.cssSelector("[href='/ua/reminder/']"));
        forgoPassword.click();

        WebElement writeUsername = getDriver().findElement(By.cssSelector("[placeholder='E-mail або номер мобільного телефону']"));
        writeUsername.sendKeys(userWord);

        WebElement clickSend = getDriver().findElement(By.cssSelector("[class='btn btn--graphite reminder-form__button']"));
        clickSend.click();

        WebElement errorMessage = getDriver().findElement(By.cssSelector("[class='error m_b-5']"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }
}
