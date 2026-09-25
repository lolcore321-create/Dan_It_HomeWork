package AQA_HW_9;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductVerify extends BaseTest {
    @Test
    @Description("Selecting a category and navigating to a subcategory – selecting a product – product information")
    @Epic("Category, subcategory, and product information")
    @Feature("Subcategory navigation and product information")
    @Link(name = "Requirement", url = "https://prom.ua/ua/")
    @Issue("Jira-00002")
    public void clickProductAndDelivery() {
        HomePage homePage = new HomePage();
        homePage.clickCategory();

        CategoryPage categoryPage = new CategoryPage();
        String actualTitleCategory = categoryPage.resultCategory();
        Assert.assertTrue(actualTitleCategory.contains("Одяг та взуття"));
        categoryPage.clickToSubcategory();
        String actualTitleSubcategory = categoryPage.textPageSubcategory();
        Assert.assertTrue(actualTitleSubcategory.contains("Карнавальні костюми"));
        categoryPage.clickProduct(2);

        ProductPage productPage = new ProductPage();
        productPage.clickToReadMore();
        productPage.clickProductsSimilarOfSpecification();
    }
}
