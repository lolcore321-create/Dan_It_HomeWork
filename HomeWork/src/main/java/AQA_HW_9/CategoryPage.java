package AQA_HW_9;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CategoryPage {
    @Step("Category name check")
    public String resultCategory() {
        return $("[class='la9uy _51RmA HnEWH']").shouldBe(visible).getText();
    }

    @Step("Clicking on a subcategory")
    public void clickToSubcategory() {
        $("[href='/ua/Karnavalnye-kostyumy']").click();
    }

    @Step("Subcategory Name Check")
    public String textPageSubcategory() {
        return $("[class='la9uy _51RmA HnEWH']").shouldBe(visible).getText();
    }

    @Step("Clicking on the product")
    public int clickProduct(int index) {
        $$("[class='se07P aV5Sw KM4PI']").get(index).click();
        return index;
    }
}
