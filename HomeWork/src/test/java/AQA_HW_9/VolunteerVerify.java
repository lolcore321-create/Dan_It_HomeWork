package AQA_HW_9;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VolunteerVerify extends BaseTest {
    @Test
    @Description("Choosing a fund to support the Armed Forces of Ukraine")
    @Epic("Donation Page, Fund Selection, Fund")
    @Feature("Donat's Choice")
    @Link(name = "Requirement", url = "https://prom.ua/ua/")
    @Issue("Jira-00004")
    public void donationVerification() {
        HomePage homePage = new HomePage();
        homePage.clickToDonation();

        VolunteerPage volunteerPage = new VolunteerPage();
        String actualVolunteerTextPage = volunteerPage.textPageVolunteer();
        Assert.assertTrue(actualVolunteerTextPage.contains("Підтримайте збори благодійних фондів"));
        volunteerPage.clickAllDonate();

        ChoosingToDonate choosingToDonate = new ChoosingToDonate();
        choosingToDonate.clickDonate(3);
        choosingToDonate.verifyUrlDonate();
    }
}
