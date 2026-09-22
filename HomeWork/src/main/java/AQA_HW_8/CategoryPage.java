package AQA_HW_8;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;

public class CategoryPage {
    public String getCurrentUrl() {
        return url();
    }

    public void clickCategory() {
        $("[href='/ua/power/internet-bez-svitla/']").click();
    }

    public String getCategoryTitleText() {
        return $("[class*='title-page']").shouldBe(visible).getText();
    }

    public void clickWiFiCategory() {
        $("[href='/ua/computer/besprovodnoe-oborudovanie/']").click();
    }
}
