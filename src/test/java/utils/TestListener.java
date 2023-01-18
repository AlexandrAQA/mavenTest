package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.concurrent.TimeUnit;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult){
        System.out.println(String.format("================= TEST IS RUNNING %s ================", iTestResult));
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult){
        System.out.println(String.format("================= FINISHED TEST %s Duration: %ss ================", iTestResult,
                getExecutionTime(iTestResult)));
    }
    @Override
    public void onTestFailure(ITestResult iTestResult){
        System.out.println(String.format("=================!!! FAILED TEST %s Duration: %ss ================", iTestResult,
                getExecutionTime(iTestResult)));
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult){
        System.out.println(String.format("================= SKIPPED TEST %s ================", iTestResult));
    }

    private long getExecutionTime(ITestResult iTestResult){
        return TimeUnit.MILLISECONDS.toSeconds(iTestResult.getEndMillis()-iTestResult.getStartMillis());
    }
}
