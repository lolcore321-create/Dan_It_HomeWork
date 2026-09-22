package AQA_HW_8;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    public String getProductTitle() {
        return $("[class='title__main']").shouldBe(visible).getText();
    }
    public String getProductCategoryTitle() {
        return $("[class='catalog-title__main']").shouldBe(visible).getText();
    }
}
