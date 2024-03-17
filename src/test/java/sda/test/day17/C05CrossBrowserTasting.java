package sda.test.day17;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import sda.utilites.ParameterBrowserTestBase;
import sda.utilites.TestBase;

public class C05CrossBrowserTasting extends ParameterBrowserTestBase {

    @Test
    public void test1() {
        driver.get("https://www.clarusway.com./");
    }

    @Test
    public void test2() {
        driver.get("https://www.ebay.com/");
    }

    @Test
    public void test3() {
        driver.get("https://www.linkedin.com/");
    }

    @Test
    public void test4() {
        driver.get("https://www.clarusway.com./");
    }
}