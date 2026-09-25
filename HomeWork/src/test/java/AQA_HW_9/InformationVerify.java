package AQA_HW_9;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InformationVerify extends BaseTest {

    @Test
    @Description("Help page and email field validation for the 'Send Request' form")
    @Epic("Help page, Form to fill out")
    @Feature("Feedback form")
    @Link(name = "Requirement", url = "https://prom.ua/ua/")
    @Issue("Jira-00003")
    public void verifyPublisherCategory() {
        String email = "abracadabra";
        String numberPhone = "42142525";
        String topic = "Subject of the situation";
        String description = "We are describing the situation.";

        HomePage homePage = new HomePage();
        homePage.clickToBuyersGuide();

        HelpForBuyersPage helpForBuyersPage = new HelpForBuyersPage();
        helpForBuyersPage.verifyUrl();
        helpForBuyersPage.sendRequest();
        helpForBuyersPage.clickProblemTypeField();
        helpForBuyersPage.selectionOnTheProblem("Кабінет покупця");

        ReportPage reportPage = new ReportPage();
        reportPage.emailField(email);
        reportPage.phoneNumber(numberPhone);
        reportPage.selectRequestTopicByKeyboard();
        reportPage.writeTheTopic(topic);
        reportPage.writeDescription(description);
        reportPage.clickToSend();
        String actualErrorMassage = reportPage.errorMessage();
        Assert.assertTrue(actualErrorMassage.contains("неправильний формат"));
    }
}
