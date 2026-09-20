package AQA_HW_7;


import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;


public class SearchVerificationAndLogin extends BaseTest {

    @Test
    public void verifySearchingDriverWorks() {
        String wordToSearch = "Samsung";
        int productIndex = 2;

        HomePage homePage = new HomePage(getDriver());
        homePage.searchTextEnter(wordToSearch);

        homePage.clickToButton();


        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        String actualTitleText = searchResultPage.getTitleText();

        Assert.assertTrue(actualTitleText.contains(wordToSearch));

        String expectedProductName = searchResultPage.getProductName(productIndex);
        searchResultPage.clickOnProduct(productIndex);

        ProductPage productPage = new ProductPage(getDriver());
        String actualProductText = productPage.getProductPage();

        Assert.assertTrue(actualProductText.contains(expectedProductName));
    }

    @Test
    public void verifyLoginInvalidShowsError() {
        String invalidLogin = "ligin321@erroe.com";
        String invalidPassword = "password123";

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAccountIcon();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.enterLogin(invalidLogin);
        loginPage.enterPassword(invalidPassword);
        loginPage.clickLoginButton();

        String actualErrorText = loginPage.getErrorMessageText();
        Assert.assertTrue(actualErrorText.contains("Введіть коректний email або номер мобільного телефону"));

        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(getDriver());

        String actualForgotPasswordTitle = forgotPasswordPage.getPageTitleText();
        Assert.assertTrue(actualForgotPasswordTitle.contains("Відновлення"));

        forgotPasswordPage.inputField(invalidPassword);
        forgotPasswordPage.clickButtonTo();

        String resultText = forgotPasswordPage.getTitleTextPagePassword();
        Assert.assertTrue(resultText.contains("Введіть email або номер мобільного телефону"));
    }
    }
