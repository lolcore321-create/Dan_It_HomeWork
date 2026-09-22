package AQA_HW_8;

import static com.codeborne.selenide.Selenide.$;


public class ComparisonPage {
    public String getComparedProductsTitleCount() {
        return $("[class='cmp__title m_b-5']").getText();
    }
}
