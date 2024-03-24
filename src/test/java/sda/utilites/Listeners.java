package sda.utilites;

import org.testng.*;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Listeners implements ITestListener, IRetryAnalyzer, IAnnotationTransformer {


    // Overrides the onFinish method from the ITestListener interface

    @Override
    public void onStart(ITestContext context) {


    }

    @Override
    public void onFinish(ITestContext context) {
        // Prints a message indicating that the test execution has ended
        System.out.println("the moment test execution ended..");
        // Prints a separator line to denote the end of test execution
        System.out.println("-------------------");
        // Prints the end time of the test execution obtained from the context
        System.out.println("End time : " + context.getEndDate());
    }

    // Overrides the onTestStart method from the ITestListener interface
    @Override
    public void onTestStart(ITestResult result) {
        // Prints a message indicating that a test is starting along with its name
        System.out.println(result.getName() + " test is starting...");
    }

    // Overrides the onTestSuccess method from the ITestListener interface
    @Override
    public void onTestSuccess(ITestResult result) {
        // Prints a message indicating that a test has been successfully executed along with its name
        System.out.println(result.getName() + " test is successfully executed...");
    }

    // Overrides the onTestFailure method from the ITestListener interface
    @Override
    public void onTestFailure(ITestResult result) {
        // Prints a message indicating that a test has failed along with its name
        System.out.println(result.getName() + " test is failed...");
    }

    // Overrides the onTestSkipped method from the ITestListener interface
    @Override
    public void onTestSkipped(ITestResult result) {
        // Prints a message indicating that a test has been skipped along with its name
        System.out.println(result.getName() + " test is skipped...");
    }

    // Overrides the onTestFailedButWithinSuccessPercentage method from the ITestListener interface
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Prints a message indicating that a test has failed with average below 80% along with its name
        System.out.println(result.getName() + " test has failed with average below 80% ...");
    }

    // Overrides the onTestFailedWithTimeout method from the ITestListener interface
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        // Prints a message indicating that a test has failed due to timeout along with its name and class
        System.out.println(result.getName() + " from " + result.getTestClass() + " test has failed due to timeout..");

    }
//    ----------------------------------------------------------

    // Automatically retries failed test scenarios
// IRetryAnalyzer Method Implemented
// This method will be automatically called to RETRY FAILED TEST SCENARIOS
    private int retryCount = 0;
    private static final int maxRetryCount = 2; // RETRY COUNT

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }

    // IAnnotationTransformer method added
// This automatically retries failed test scenarios using testng xml files
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(Listeners.class);
    }
}