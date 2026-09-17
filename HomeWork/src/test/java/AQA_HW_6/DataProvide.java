package AQA_HW_6;

import org.testng.annotations.DataProvider;

public class DataProvide {
    @DataProvider
    public Object[][] getSearchData() {
        return new Object[][] {
                {"Samsung"},
                {"RTX 5090"}
        };
    }
    @DataProvider
    public Object[][] getUserRegisterData() {
        return new Object[][] {
                {"Anton"}
        };
    }
}