package AQA_HW_11;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static java.lang.Thread.sleep;

public class HomePage {
    public void openHomePage() {
        Selenide.open("https://hotline.ua/");
    }

    public void enterSearchWord(String wordToSearch) throws InterruptedException {
        $("[type='text']").setValue(wordToSearch);
        sleep(3000);
    }

    public void clickOnSearchButton() {
        $("[class*='search__btn ']").click();
    }

    public void clickOnMainCatalogButton() {
        $("div.button-menu-main ").click();
    }

    public boolean verifyMainCatalogMenuIsDisplayed() {
        return $("ul.menu-main__list").shouldBe(visible).isDisplayed();
    }

    public void clickOnCategory() {
        $("[data-id='196']").click();
    }

    public void clickOnFeedback() {
        $("[href='/ua/feedback/']").click();
    }
    public void clickOnCategoryBrands() {
        $("[href='/ua/brands/']").click();
    }
}
