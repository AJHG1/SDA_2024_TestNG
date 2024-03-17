package sda.test.day17;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sda.utilites.TestBase;

public class C03FakerDataProvider03 extends TestBase {


    //Go to URL: https://opensource-demo.orangehrmlive.com/
    //Login with negative credentilas by Data Provider.
    //Then assert that ''Invalid credentials'’ is displayed.


    By usernameFiled = By.name("username");
    By passwordFiled = By.name("password");
    By ButtonTag = By.tagName("button");
    By InvalidTextByxpath = By.xpath("//*[.='Invalid credentials']");

    @Test(dataProvider = "invalidCoredentials")
    public void navgiteLoginTest(String username, String password) throws InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(usernameFiled).sendKeys(username);
        driver.findElement(passwordFiled).sendKeys(password);
        driver.findElement(ButtonTag).click();
        Thread.sleep(2000);
        WebElement errorMassage = driver.findElement(InvalidTextByxpath);
        Assert.assertTrue(errorMassage.isDisplayed());
    }

    @DataProvider(name = "invalidCoredentials")
    public Object[][] getData() {
        Faker faker = new Faker();
        return new Object[][]{

                {faker.name().username(), faker.internet().password()},
                {faker.name().username(), faker.internet().password()},
                {faker.name().username(), faker.internet().password()},
                {faker.name().username(), faker.internet().password()},
                {faker.name().username(), faker.internet().password()},

        };
    }
}
