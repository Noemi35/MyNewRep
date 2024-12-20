package ListenersNgExtentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener {

    public void onTestStart(ITestResult result) { //executed for every test
        System.out.println("On test start started");
    }


    public void onTestSuccess(ITestResult result) {
        System.out.println("On test success");
    }


    public void onTestFailure(ITestResult result) {

        System.out.println("On test success");}

    public void onTestSkipped(ITestResult result) {
        System.out.println("On test skipped");
    }


    public void onStart(ITestContext context) { //executed one time
        System.out.println("On start started");
    }


    public void onFinish(ITestContext context) {
        System.out.println("On test finish");
    }
}



