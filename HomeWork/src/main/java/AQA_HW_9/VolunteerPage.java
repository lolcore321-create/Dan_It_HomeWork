package AQA_HW_9;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VolunteerPage {
    @Step("Verify text title Page")
    public String textPageVolunteer() {
        return $("[class='eyMft2TORh29uC86IRml']").shouldBe(visible).getText();
    }

    @Step("Clicking the 'All Fundraisers' button")
    public void clickAllDonate() {
        $("[class='v_yKtHX2fPdzMVaxNfWv']").click();
    }
}
