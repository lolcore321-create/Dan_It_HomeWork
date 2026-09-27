package AQA_HW_10;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {
    public String inputToSearchField(String textToString) {
        $("[placeholder='Пошук у крамниці']").setValue(textToString);
        return textToString;
    }

    public void clickButtonSearch() {
        $("[type='submit']").click();
    }

    public void hoverOverTheCommunity() {
        $$("[data-tooltip-content='.submenu_Community']").filter(visible)
                .first().hover();
    }

    public void clickToDiscussion() {
        $$("a[href='https://steamcommunity.com/discussions/']").filter(visible)
                .first()
                .click();
    }
}
