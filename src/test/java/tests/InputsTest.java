package tests;

import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest{
    @Test
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

