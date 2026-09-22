package AQA_HW_8;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public void searchTextField(String textToSearch) {
        $("[type='text']").setValue(textToSearch);
        $("[title='Поиск']").click();
    }

    public void clickCatalogButton() {
        $("[class='button-menu-main ']").click();
        $("[href='/ua/catalog/']").click();
    }

    public void clickComparison() {
        $("[data-tracking-id='global-16']").click();
    }
    public void clickListComparison() {
        $("[class='profile-sidebar__section-child']").click();
    }
}
