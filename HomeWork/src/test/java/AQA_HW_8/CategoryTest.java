package AQA_HW_8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoryTest extends BaseTest {

    @Test
    public void verifyCategoryPageOpensProduct() {
        HomePage homePage = new HomePage();
        homePage.clickCatalogButton();

        CategoryPage categoryPage = new CategoryPage();
        String actualUrl = categoryPage.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("catalog"));
        categoryPage.clickCategory();
        String actualTitlePage = categoryPage.getCategoryTitleText();
        Assert.assertTrue(actualTitlePage.contains("Інтернет без світла"));
        categoryPage.clickWiFiCategory();

        ProductPage productPage = new ProductPage();
        String actualProductCategoryPage = productPage.getProductCategoryTitle();
        Assert.assertTrue(actualProductCategoryPage.contains("Wi-Fi маршрутизатори і точки доступу"));
    }
}
