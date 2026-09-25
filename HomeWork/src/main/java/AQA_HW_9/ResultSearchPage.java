package AQA_HW_9;

import com.codeborne.selenide.CollectionCondition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ResultSearchPage {

    @Step("Checking the search result")
    public String resultTextTitle() {
        return $("[class*='la9uy _51']").shouldBe(visible).getText();
    }

    @Step("Adding to Cart")
    public void addToCart(int index) {
        $$("[data-qaid='buy-button']").get(index).click();
    }

    @Step("Clicking the Basket")
    public void clickToBasket() {
        $("[data-qaid='shopping_cart']").click();
    }

    @Step("Checking the quantity of items added to the cart")
    public int checkingItemsToCard(int expectedCount) {
        $$("[data-testid='product_item']").shouldHave(CollectionCondition.size(expectedCount));
        return expectedCount;
    }
}
