package AQA_HW_10;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GamePage {
    public void handleAgeGateIfPresent() {
        if ($(By.id("app_agegate")).exists()) {
            $("[name='ageDay']").selectOption("1");
            $(By.name("ageMonth")).selectOptionByValue("May");
            ;
            $("[name='ageYear']").selectOption("1998");
            $(By.id("view_product_page_btn")).click();
        }
    }

    public String checkTitleText() {
        return $("[role='heading']").shouldBe(visible).getText();
    }

    public String getGamePrice() {
        return $("[data-price-final='139900']").shouldBe(visible).getText().trim();
    }

    public int clickAddToCart(int index) {
        $$("[class='btn_green_steamui btn_medium']").get(index).click();
        return index;
    }

    public void checkToBasked() {
        $("[href='https://store.steampowered.com/cart/?snr=1_5_9_']").click();
    }
}
