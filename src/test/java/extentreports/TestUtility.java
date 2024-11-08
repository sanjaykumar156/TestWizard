package extentreports;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class TestUtility extends TestCases.BaseClass {
	
	public void getscreenshot() throws IOException {
		Date currentdate = new Date();
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File(".//Screenshots//" +timeStamp+ ".png");
		FileUtils.copyFile(screenshotFile,destination);
	}
}
