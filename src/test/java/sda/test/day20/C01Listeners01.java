package sda.test.day20;

import org.testng.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(sda.utilites.Listeners.class)
public class C01Listeners01 {


    @Test
    public void successfulTest() {
        Assert.assertEquals(1, 1);
    }


    @Test
    public void failedTest() {
        Assert.assertEquals(1, 2);
    }


    @Test
    public void skippedTest() {
        throw new SkipException("Test is skipped");
    }


    @Test
    public void successTest(ITestContext context) {
        // Prints the number of failed tests from the test context
        System.out.println(context.getFailedTests().size());
        // Asserts true to indicate successful execution
        Assert.assertTrue(true);
        // Sets an attribute named "data" in the test context
        context.setAttribute("data", 10);
        // Retrieves the value of attribute "data" from the test context and prints it
        int x = (int) context.getAttribute("data");
        System.out.println("x = " + x);
    }


    @Test(timeOut = 1000)
    public void timeoutTest() throws InterruptedException {
        // Asserts equality to ensure proper functioning
        Assert.assertEquals(1, 1);
        // Introduces a delay to trigger a timeout condition
        Thread.sleep(2000);
    }


    @Test(successPercentage = 80)
    public void successfulTestWithPercentage() {
        // Asserts multiple conditions to meet the success percentage threshold
        Assert.assertEquals(1, 1);
        Assert.assertEquals(2, 2);
        Assert.assertEquals(2, 1);
    }

}