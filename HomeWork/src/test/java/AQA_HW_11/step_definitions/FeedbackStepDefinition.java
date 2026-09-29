package AQA_HW_11.step_definitions;

import AQA_HW_11.FeedbackPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class FeedbackStepDefinition {
    private FeedbackPage feedbackPage = new FeedbackPage();

    @When("User enters name {string} word into name field")
    public void entersNameWord(String wordToName) {
        feedbackPage.enterNameWord(wordToName);
    }

    @When("User selects message topic on Feedback Page")
    public void selectTopic() {
        feedbackPage.selectTopicWithKeyboard();
    }

    @When("User enters {string} text into message field on Feedback Page")
    public void entersMessage(String wordToMessage) {
        feedbackPage.enterMessage(wordToMessage);
    }

    @When("User enters {string} email into email field on Feedback Page")
    public void entersEmail(String wordToEmail) {
        feedbackPage.entersEmail(wordToEmail);
    }

    @When("User clicks on send button on Feedback Page")
    public void clickOnSendButton() {
        feedbackPage.clicksOnSendButton();
    }

    @Then("Verify success message appears on Feedback Page")
    public void verifyTextTitleSendFeedback() {
        String actualTitleTextFeedback = feedbackPage.verifyTextTitleSendFeedback();
        Assert.assertTrue(actualTitleTextFeedback.contains("Дякую! Ми вже опрацьовуємо ваше звернення"));
    }
}
