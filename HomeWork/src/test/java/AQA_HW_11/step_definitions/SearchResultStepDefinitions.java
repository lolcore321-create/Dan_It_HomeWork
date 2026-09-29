package AQA_HW_11.step_definitions;

import AQA_HW_11.SearchResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SearchResultStepDefinitions extends BaseStepDefinition {

    private SearchResultPage searchResultPage = new SearchResultPage();

    @When("User remember {int} product name on Search Result Page")
    public void rememberProductName(int productIndex) {
        String expectedProductName = searchResultPage.getProductName(productIndex);
        putValueToMapByKay("expectedProductName", expectedProductName);
    }

    @When("User clicks on {int} product picture on Search Result Page")
    public void clickOnProductPicture(int productIndex) {
        searchResultPage.clickOnProductPicture(productIndex);
    }

    @Then("title contains {string} search word on Search Result Page")
    public void verifyTitle(String wordToVerify) {
        String actualTitle = searchResultPage.getTitle();
        Assert.assertTrue(actualTitle.contains(wordToVerify));
    }
}
