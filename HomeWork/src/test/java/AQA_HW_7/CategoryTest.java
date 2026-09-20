package AQA_HW_7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoryTest extends BaseTest {
    @Test
    public void categoryAllProductTest() {
        HomePage homePage = new HomePage(getDriver());

        homePage.clickAllCategory();
        homePage.clickAllCategoryButton();

        CategoryPage categoryPage = new CategoryPage(getDriver());
        String actualUrl = categoryPage.getCurrentUrl();
        categoryPage.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("catalog"));

        categoryPage.clickCategory();

        ProductPage productPage = new ProductPage(getDriver());
        String actualCategoryProduct = productPage.getCategoryTitleText();
        Assert.assertTrue(actualCategoryProduct.contains("Інтернет без світла"));
    }
}
