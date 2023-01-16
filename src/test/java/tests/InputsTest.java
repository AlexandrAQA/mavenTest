package tests;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Big Epic")
@Feature("New Feature")
public class InputsTest extends BaseTest{

    @Story("Inputs story")
    @Test
    @Description("Inputs validation")
    public void TestInputs(){
        driver.findElement(By.linkText("Inputs")).click();
        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys(Keys.ARROW_UP);

        driver.navigate().back();
    }

    @Issue("Bug-01")
    @TmsLink("case=79")
    @Link("https://github.com/AlexandrAQA") //url on docs or important info
    @Test
    public void TestInputsFail(){
        Assert.fail("Demonstration"); //to fail test
        driver.findElement(By.linkText("Inputs")).click();
        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys(Keys.ARROW_UP);

        driver.navigate().back();
    }
}

