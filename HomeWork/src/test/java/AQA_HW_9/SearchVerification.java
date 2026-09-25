package AQA_HW_9;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchVerification extends BaseTest {

    @Test
    @Description("Checking search results and adding to cart")
    @Epic("Search and Card")
    @Feature("search field and number of items in the cart")
    @Link(name = "Requirement", url = "https://prom.ua/ua/")
    @Issue("Jira-00001")
    public void verifySearchWorks() {
        String wordToSearch = "invertor";

        HomePage homePage = new HomePage();
        homePage.searchField(wordToSearch);
        homePage.clickSearchButton();

        ResultSearchPage resultSearchPage = new ResultSearchPage();
        String actualTitleText = resultSearchPage.resultTextTitle();
        Assert.assertTrue(actualTitleText.contains(wordToSearch));
        resultSearchPage.addToCart(2);
        resultSearchPage.addToCart(4);
        resultSearchPage.clickToBasket();
        resultSearchPage.checkingItemsToCard(2);
    }
}
