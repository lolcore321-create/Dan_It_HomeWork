package AQA_HW_8;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void driverInit() {
        Selenide.open("https://hotline.ua/");
    }
}
