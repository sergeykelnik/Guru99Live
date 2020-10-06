package TestList1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class TestCase2 extends BaseTest {

    @Test(priority = 2)
    public void VerifyPricesPdpPlp() {

        $(By.xpath("//a[contains(text(),'Mobile')]")).click();
        String Price = $(By.id("product-price-1")).getText();
        $("#product-collection-image-1").click();
        System.out.println(Price);
        Assert.assertEquals(Price, $(By.id("product-price-1")).getText());
    }

}
