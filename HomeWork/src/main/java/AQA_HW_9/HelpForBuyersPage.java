package AQA_HW_9;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class HelpForBuyersPage {
    @Step("Verification url")
    public void verifyUrl() {
        Selenide.Wait().until(webDriver -> webDriver.getCurrentUrl().contains("https://help.prom.ua/hc/uk"));
    }

    @Step("Clicking the 'Send Request' button in the top menu")
    public void sendRequest() {
        $("[href='/hc/uk/requests/new']").click();
    }

    @Step("Clicking the Issues selection field")
    public void clickProblemTypeField() {
        $("[class='nesty-input']").click();
    }

    @Step("Selection of a problem in the field")
    public void selectionOnTheProblem(String optionText) {
        $("#request_issue_type_select").selectOption(optionText);
    }
}
