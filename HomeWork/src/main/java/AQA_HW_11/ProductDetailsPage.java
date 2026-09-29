package AQA_HW_11;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductDetailsPage {
    public String getProductName() {
        return $("h1.title__main").shouldBe(visible).getText();
    }
    public String getProductNames() {
        return $("[class='title__main']").getText();
    }
}
