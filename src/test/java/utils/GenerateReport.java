package utils;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class GenerateReport implements ITestListener {

    private static final Logger LOGGER = LogManager.getLogger(GenerateReport.class);
    
    @Override
    public void onStart(ITestContext arg0) {

        LOGGER.info("+Begin test: " + arg0.getName());

    }

    @Override
    public void onTestStart(ITestResult arg0) {

        LOGGER.info(" Starting test: " + arg0.getName());

    }

    @Override
    public void onTestSuccess(ITestResult arg0) {

        LOGGER.info(" Test passed: " + arg0.getName());

    }

    @Override
    public void onTestFailure(ITestResult arg0) {

        LOGGER.info(" Test failed: " + arg0.getName());

    }

    @Override
    public void onTestSkipped(ITestResult arg0) {

        LOGGER.info(" Test ignored: " + arg0.getName());

    }

    @Override
    public void onFinish(ITestContext arg0) {

        LOGGER.info("-End test: " + arg0.getName());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

        // TODO Auto-generated method stub

    }

}