package AQA_HW_8;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchVerification extends BaseTest {

    @Test
    public void verifySearchWorks() {
        String worldToSearch = "Samsung";
        int productIndex = 2;

        HomePage homePage = new HomePage();
        homePage.searchTextField(worldToSearch);

        SearchResultPage searchResultPage = new SearchResultPage();
        String actualTitleText = searchResultPage.getTextTitle();
        Assert.assertTrue(actualTitleText.contains(worldToSearch));

        String expectedProductName = searchResultPage.getProductName(productIndex);
        searchResultPage.clickOnProduct(productIndex);


        ProductPage productPage = new ProductPage();
        String actualProductText = productPage.getProductTitle();
        Assert.assertTrue(actualProductText.contains("Смартфон Samsung Galaxy S26 12/256GB Black (SM-S942BZKG)"));
    }
}
