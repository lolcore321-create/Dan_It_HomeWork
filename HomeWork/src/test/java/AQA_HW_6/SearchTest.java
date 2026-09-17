package AQA_HW_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;


public class SearchTest extends BaseTest  {
    @Test(dataProvider = "getSearchData", dataProviderClass = DataProvide.class, groups = {"positive"})
    public void searchCheck(String worldSearch) {

        WebElement searchField = getDriver().findElement(By.cssSelector("[type='text']"));
        searchField.sendKeys(worldSearch);

        WebElement searchButton = getDriver().findElement(By.cssSelector("[class*='search__btn ']"));
        searchButton.click();

        List<WebElement> productsSearch = getDriver().findElements(By.cssSelector("[class*='list-item list']"));
        Assert.assertFalse(productsSearch.isEmpty());
    }

    @Test(groups = {"negative"})
    public void negativeSearch() {

        WebElement searchFieldWrong = getDriver().findElement(By.cssSelector("[type='text']"));
        searchFieldWrong.sendKeys("GamePass");

        WebElement searchButtonWrong = getDriver().findElement(By.cssSelector("[class*='search__btn ']"));
        searchButtonWrong.click();

        WebElement notFound = getDriver().findElement(By.cssSelector("[class*='search__no-items-']"));
        String noItemsPage = notFound.getText();
        Assert.assertTrue(noItemsPage.contains("За запитом GamePass нічого не знайдено"));
    }
}
