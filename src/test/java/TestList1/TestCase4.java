package TestList1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class TestCase4 extends BaseTest {

    @Test(priority = 4)
    public void CompareTwoProducts() {

        $(By.linkText("MOBILE")).click();
        $(By.tagName("select")).selectOption("Position");

        // Workaround for IE
        if ($(By.linkText("Clear All")).exists()) {
            $(By.linkText("Clear All")).click();
            confirm();
        }
        // Workaround for IE

        $(By.xpath("//*[@id=\"top\"]/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a"))
                .click();
        $(By.xpath("//*[@id=\"top\"]/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/ul/li[2]/a"))
                .click();
        $(By.xpath("//button[@title='Compare']")).click();
        switchTo().window("Products Comparison List - Magento Commerce");
        Assert.assertEquals($(By.xpath("//h2/a[@title='Sony Xperia']")).getText(), "SONY XPERIA");
        Assert.assertEquals($(By.xpath("//h2/a[@title='Samsung Galaxy']")).getText(), "SAMSUNG GALAXY");
        $(By.xpath("//button[@title='Close Window']")).click();
        switchTo().window("Mobile");
    }

}