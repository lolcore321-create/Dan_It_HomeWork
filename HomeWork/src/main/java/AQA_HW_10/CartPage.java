package AQA_HW_10;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class CartPage {
    public String getCartTotalPrice() {
        return $$(By.xpath("//div[text()='Попередній підсумок']/following-sibling::div"))
                .filter(visible)
                .first()
                .getText()
                .trim();
    }
}
