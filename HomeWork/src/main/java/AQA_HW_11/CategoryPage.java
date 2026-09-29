package AQA_HW_11;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CategoryPage {
    public void clickOnSubcategory() {
        $("a.section-navigation__link[href='/ua/av/televizory/']").click();
    }
    public String verifyTitleTextSubcategory() {
       return  $("[class='catalog-title__main']").shouldBe(visible).getText();
    }
}
