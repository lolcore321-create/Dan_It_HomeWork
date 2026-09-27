package AQA_HW_10;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class DiscussionPage {
    public String verifyTitleText() {
        return $("[class='large_title']").shouldBe(visible).getText();
    }

    public void clickForumGame() {
        $("[id='tab_games']").click();
    }

    public String inputSearchGameField(String textToGame) {
        SelenideElement searchField = $("[placeholder='Знайти за назвою гри']");
        searchField.setValue(textToGame);
        $(xpath("//*[text()='" + textToGame + "']")).shouldBe(visible).click();
        return textToGame;
    }

    public String verifyTitleTextDiscussion() {
        return $("[class='apphub_AppName ellipsis']").shouldBe(visible).getText();
    }
}
