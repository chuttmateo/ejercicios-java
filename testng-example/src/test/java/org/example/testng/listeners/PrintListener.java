package org.example.testng.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class PrintListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started " + result.getName());
    }
}
