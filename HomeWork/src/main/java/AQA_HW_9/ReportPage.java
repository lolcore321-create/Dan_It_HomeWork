package AQA_HW_9;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ReportPage {
    @Step("Entering an email address into the input field")
    public String emailField(String textToEmail) {
        $("[name='request[anonymous_requester_email]']").setValue(textToEmail);
        return textToEmail;
    }

    @Step("Entering the phone number into the input field")
    public String phoneNumber(String textNumber) {
        $("[type='number']").setValue(textNumber);
        return textNumber;
    }

    @Step("Selecting the help topic using the keyboard")
    public void selectRequestTopicByKeyboard() {
        SelenideElement dropdown = $(("a.nesty-input"));
        dropdown.click();
        dropdown.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN);
        dropdown.sendKeys(Keys.ENTER);
    }

    @Step("Entering text into the 'Subject' field")
    public String writeTheTopic(String textTopic) {
        $("[aria-labelledby='request_subject_label']").setValue(textTopic);
        return textTopic;
    }

    @Step("Entering text into the 'Description' field")
    public String writeDescription(String textDescription) {
        $("[name='request[description]']").setValue(textDescription);
        return textDescription;
    }

    @Step("Clicking the Send button")
    public void clickToSend() {
        $("[type='submit']").click();
    }

    @Step("Checking text written with an invalid email")
    public String errorMessage() {
        return $("[id='request_anonymous_requester_email_error']").shouldBe(visible).getText();
    }
}
