package AQA_HW_6.Listenerss;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("The test has started: " + result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("The test passed: " + result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("The test failed: " + result.getName());
    }
}
