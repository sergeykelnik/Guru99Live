package TestList1;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;


public class BaseTest {

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().version("85").setup();
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
        Selenide.clearBrowserCookies();
        open("http://live.guru99.com/");
    }
}