package AQA_HW_11.step_definitions;

import AQA_HW_11.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageStepDefinitions {

    private HomePage homePage = new HomePage();

    @Given("User opens Home Page")
    public void openHomePage() {
        homePage.openHomePage();
    }

    @When("User enters {string} word into search field on Home Page")
    public void entersSearchWord(String wordToSearch) throws InterruptedException {
        homePage.enterSearchWord(wordToSearch);
    }

    @When("User clicks on search button on Home Page")
    public void clickOnSearchButton() {
        homePage.clickOnSearchButton();
    }

    @When("User clicks on main catalog button on Home Page")
    public void clickOnMainCatalogButton() {
        homePage.clickOnMainCatalogButton();
    }


    @When("User clicks on category TV on Home Page")
    public void clickOnSubcategory() {
        homePage.clickOnCategory();
    }

    @When("User clicks on User feedback")
    public void clicksOnFeedback() {
        homePage.clickOnFeedback();
    }

    @When("User clicks on brands category on Home Page")
    public void clicksOnCategoryBrands() {
        homePage.clickOnCategoryBrands();
    }

    @Then("Verify main catalog menu appears on Home Page")
    public void verifyMainCatalogMenuIsDisplayed() {
        Assert.assertTrue(homePage.verifyMainCatalogMenuIsDisplayed());
    }

}
