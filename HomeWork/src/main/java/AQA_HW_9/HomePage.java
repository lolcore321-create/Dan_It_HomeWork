package AQA_HW_9;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    @Step("Input into the search field")
    public String searchField(String textToString) {
        $("[type='search']").setValue(textToString);
        return textToString;
    }

    @Step("Pressing the search button")
    public void clickSearchButton() {
        $("[type='submit']").click();
    }

    @Step("Clicking on a category")
    public void clickCategory() {
        $("[href='/ua/Odezhda']").click();
    }

    @Step("Clicking on Buyer Help")
    public void clickToBuyersGuide() {
        $("[href='https://help.prom.ua/hc/uk']").click();
        ArrayList<String> tabs = new ArrayList<>(Selenide.webdriver().driver().getWebDriver().getWindowHandles());
        Selenide.switchTo().window(tabs.get(tabs.size() - 1));
    }

    @Step("Click to Support the Defense Forces")
    public void clickToDonation() {
        $("[href='https://volonter.prom.ua/']").click();
        ArrayList<String> tabs = new ArrayList<>(Selenide.webdriver().driver().getWebDriver().getWindowHandles());
        Selenide.switchTo().window(tabs.get(tabs.size() - 1));
    }
}
