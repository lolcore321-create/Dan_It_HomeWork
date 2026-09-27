package AQA_HW_10;

import org.testng.Assert;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class TestingSearchAndCart extends BaseTest {
    @Test
    public void verifySearchAndCart() {
        testCaseId = 1;
        String gamesName = "Stalker 2";

        HomePage homePage = new HomePage();
        homePage.inputToSearchField(gamesName);
        homePage.clickButtonSearch();

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.clickGame();

        GamePage gamePage = new GamePage();
        gamePage.handleAgeGateIfPresent();
        String actualNameGame = gamePage.checkTitleText();
        Assert.assertTrue(actualNameGame.contains("S.T.A.L.K.E.R. 2: Heart of Chornobyl"));
        String priceOnGamePage = gamePage.getGamePrice();
        gamePage.clickAddToCart(0);
        gamePage.checkToBasked();

        CartPage cartPage = new CartPage();
        String priceInCart = cartPage.getCartTotalPrice();
        double expectedPrice = parsePrice(priceOnGamePage);
        double actualPrice = parsePrice(priceInCart);

        assertEquals(expectedPrice, actualPrice, 0.01);

    }


    private static double parsePrice(String rawPrice) {
        String cleaned = rawPrice
                .replace("₴", "")
                .replace(" ", "")
                .replace(",", ".")
                .trim();
        return Double.parseDouble(cleaned);
    }
}
