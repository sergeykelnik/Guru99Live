package TestList1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class TestCase3 extends BaseTest {

    @Test(priority = 3)
    public void AddProductsToBasket() {

        $(By.linkText("MOBILE")).click();
        $(By.xpath("//ul[@class='products-grid products-grid--max-4-col first last odd']//li[1]//div[1]//div[3]//button[1]"))
                .click();
        $(By.xpath("//input[@title='Qty']")).setValue("1000");
        $(By.xpath("//button[@title='Update']")).click();
        Assert.assertEquals("Some of the products cannot be ordered in requested quantity.",
                $(By.xpath("//*[@id=\"top\"]/body/div[1]/div/div[2]/div/div/div/ul/li/ul/li/span")).getText());
        $(By.xpath("//*[@id=\"empty_cart_button\"]/span/span")).click();
        Assert.assertEquals("SHOPPING CART IS EMPTY",
                $(By.xpath("//*[@id=\"top\"]/body/div[1]/div/div[2]/div/div/div[1]")).getText());
    }

}
