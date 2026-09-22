package AQA_HW_8;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AddToComparison extends BaseTest {

    @Test
    public void verifyAddToComparisonWorks() {
        String worldToSearch = "Samsung";

        HomePage homePage = new HomePage();
        homePage.searchTextField(worldToSearch);

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.addProductToComparison(2);
        searchResultPage.addProductToComparison(3);

        homePage.clickComparison();
        homePage.clickListComparison();

        ComparisonPage comparisonPage = new ComparisonPage();
        String actualCountTitle = comparisonPage.getComparedProductsTitleCount();
        Assert.assertTrue(actualCountTitle.contains("2 товарів"));
    }
}
