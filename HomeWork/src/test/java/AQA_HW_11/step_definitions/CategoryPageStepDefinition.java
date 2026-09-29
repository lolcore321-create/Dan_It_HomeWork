package AQA_HW_11.step_definitions;

import AQA_HW_11.CategoryPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CategoryPageStepDefinition {
    private CategoryPage categoryPage = new CategoryPage();

    @When("User clicks on subcategory on Category Page")
    public void clicksOnSubcategory() {
        categoryPage.clickOnSubcategory();
    }

    @Then("User checks the name to verify they have entered the correct subcategory")
    public void verifyTitleSubcategory() {
        String actualPageTitleText = categoryPage.verifyTitleTextSubcategory();
        Assert.assertTrue(actualPageTitleText.contains("Телевізори"));
    }
}
