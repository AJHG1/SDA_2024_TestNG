package sda.test.day18;

import org.testng.annotations.Test;

public class C03ParalleTestParameters {

    @Test(threadPoolSize = 4, invocationCount = 8, timeOut = 2000)
    public void test() {

        System.out.println("Thread Name is : " + Thread.currentThread().threadId());
    }
}
