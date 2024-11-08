package extentreports;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager extends TestUtility implements ITestListener{
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
		
	
	public void onStart(ITestContext context) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName = "Test-Report-" + ".html";
		sparkreporter = new ExtentSparkReporter(".\\Reports\\" +timeStamp+ repName);
	
		sparkreporter.config().setDocumentTitle("Automation report");
		sparkreporter.config().setReportName("functional testing");
		sparkreporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkreporter);
		extent.setSystemInfo("os", "windows11");
		extent.setSystemInfo("environment", "automation");
		extent.setSystemInfo("testername", "sanjaykumar");
		extent.setSystemInfo("browsername","chrome,edge");
		}
	
	
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "test case is passed");
	
	}
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL,"test case has been failed"+result.getThrowable());
		try {
			getscreenshot();
		}
		catch(Exception e) {
			e.getCause();
		}
	}
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.SKIP,"Test case has been skipped");
	}
	public void onFinish(ITestContext context) {
		extent.flush();
	
	}
}
