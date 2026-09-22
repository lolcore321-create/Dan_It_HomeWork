package AQA_HW_8;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {
    public String getTextTitle() {
        return $("[class='search__title']").shouldBe(visible).getText();
    }

    public String getProductName(int index) {
        return $$("[class='list-item__title-container m_b-5']").get(index).getText();
    }

    public void clickOnProduct(int index) {
        $$("[class='list-item__photo']").get(index).click();
    }
    public void addProductToComparison(int index) {
        $$("[title='Додати товар у порівняння']").get(index).click();
    }
}