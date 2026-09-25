package AQA_HW_9;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    @Step("clicking the 'More Information' button")
    public void clickToReadMore() {
        $("[data-qaid='all_descriptions']").shouldBe(visible).click();
    }

    @Step("Clicking on 'Products similar by characteristics'")
    public void clickProductsSimilarOfSpecification() {
        $("[data-qaid='search_similar']").click();
    }
}
