package tests;

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
    @Test
    public void TestInputsFail(){
        Assert.fail("Demonstration"); //to fail test
        driver.findElement(By.linkText("Inputs")).click();
        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys(Keys.ARROW_UP);

        driver.navigate().back();
    }
}

