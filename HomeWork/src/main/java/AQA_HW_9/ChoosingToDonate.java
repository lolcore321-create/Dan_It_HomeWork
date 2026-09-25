package AQA_HW_9;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;


import static com.codeborne.selenide.Selenide.$$;

public class ChoosingToDonate {
    @Step("Clicking on the fund")
    public void clickDonate(int index) {
        $$("[style='padding-left: 8px; padding-right: 8px;']").get(index).click();
    }

    @Step("Verification url")
    public void verifyUrlDonate() {
        Selenide.Wait().until(webDriver -> webDriver.getCurrentUrl().contains("funds"));
    }
}
