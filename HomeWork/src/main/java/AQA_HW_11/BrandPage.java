package AQA_HW_11;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BrandPage {
    public void clicksOnBrand() {
        $("[href='/ua/brands/a4tech/']").click();
    }

    public String getFirstProductName() {
        return $$("[class='list-item__info'] a").first().getText();
    }
    public void clickFirstProduct() {
        $$("[class='list-item__info'] a").first().click();
    }
}
