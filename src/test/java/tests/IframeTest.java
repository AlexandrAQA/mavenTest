package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframeTest extends BaseTest {

    @Test
    public void iframeTest() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        String text = driver.findElement(By.id("tinymce")).
                findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(text, "Your content goes here.");
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector("button[title='Align center'")).click();
        driver.navigate().back();
    }

        @Story("iFrame Story")
        @Test (description = "some text about it test")
        @Description("validating iframes")
        @Step("Step's name") //to know which step is failed or passed
    public void iframeTestFail() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        String text = driver.findElement(By.id("tinymce")).
                findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(text, "Your content goes here.");
        driver.switchTo().defaultContent();
            driver.findElement(By.cssSelector("button[title='Align center'")).click();
            //throw new IllegalArgumentException(); //just for yellow allure report


    }
}
