package AQA_HW_11;

import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class FeedbackPage {
    public void enterNameWord(String wordToName) {
        $("[id='name']").setValue(wordToName);
    }
    public void selectTopicWithKeyboard() {
        $("[class='feedback-form__select field']").sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }
    public void enterMessage(String wordToMessage) {
        $("[class='feedback-form__textarea field']").setValue(wordToMessage);
    }
    public void entersEmail(String wordToEmail) {
        $("[id='email']").setValue(wordToEmail);
    }
    public void clicksOnSendButton() {
        $("[type='submit']").click();
    }
    public String verifyTextTitleSendFeedback() {
       return  $("[class='text-center text-bold m_b-15']").shouldBe(visible).getText();
    }
}
