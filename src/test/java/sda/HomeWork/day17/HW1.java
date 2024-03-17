package sda.HomeWork.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sda.utilites.TestBase;

public class HW1 extends TestBase {

    //    Open the site: http://opencart.abstracta.us/index.php?route=account/login
//    Login with that credentials
//    Email: clarusway@gmail.com
//    Password: 123456789
//    Using the Search function do it with Data Provider for Mac, iPad and Samsung.
    By searchBoxId = By.xpath("//*[@name='search']");

    @Test(dataProvider = "getData")
    public void login(String seachKey) {

        driver.get("http://opencart.abstracta.us/index.php?route=account/login");

        //Email: clarusway@gmail.com
        WebElement email = driver.findElement(By.xpath("//*[@name='email']"));
        email.click();
        email.sendKeys("clarusway@gmail.com");

        //Password: 123456789
        WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
        password.click();
        password.sendKeys("123456789");

        //login
        WebElement loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();

        //searchBox
        WebElement searchBox = driver.findElement(searchBoxId);
        searchBox.sendKeys(seachKey, Keys.ENTER);

    }

    //    Using the Search function do it with Data Provider for Mac, iPad and Samsung.
    @DataProvider
    public Object[][] getData() {
        Object[][] data = {{"Mac"}, {"iPad"}, {"Samsung"}};
        return data;
    }

}
