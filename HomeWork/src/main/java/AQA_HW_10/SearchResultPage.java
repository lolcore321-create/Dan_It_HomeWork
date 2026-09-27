package AQA_HW_10;


import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage {
    public void clickGame() {
        $("[href='https://store.steampowered.com/app/1643320/STALKER_2_Heart_of_Chornobyl/?snr=1_7_7_151_150_1']").click();
    }

}
