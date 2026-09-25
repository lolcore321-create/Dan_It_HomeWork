package AQA_HW_9;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void driverUtil() {
        Selenide.open("https://prom.ua/ua/");
    }
}
