package THClients.commons;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Case Passed: " + result.getName());
        // Thêm các logs khác nếu cần
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Case Failed: " + result.getName());
        // Log kết quả thất bại và thông tin thêm nếu cần
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Case Skipped: " + result.getName());
        // Log thông báo nếu test case bị skip
    }

    // Các method khác nếu cần

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Suite is starting...");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Suite is ending...");
    }
}
