package AQA_HW_11.step_definitions;

import AQA_HW_11.BrandPage;
import AQA_HW_11.ProductDetailsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BrandStepDefinition extends BaseStepDefinition {
    private BrandPage brandPage = new BrandPage();
    private ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    @When("User clicks on 'A4Tech' brand on Brands Page")
    public void clicksOnBrand() {
        brandPage.clicksOnBrand();
    }
    @When("User selects first product on Brand Page")
    public void selectFirstProduct() {
        selectedProductName = brandPage.getFirstProductName();
        brandPage.clickFirstProduct();
    }
    @Then("Verify product name matches selected product on Product Details Page")
    public void verifyProductName() {
        String actualName = productDetailsPage.getProductNames();
        Assert.assertTrue(actualName.contains(selectedProductName));
    }
}
