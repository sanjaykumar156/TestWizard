package TestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public static WebDriver driver;
	//private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	public ResourceBundle rb =ResourceBundle.getBundle("config"); 
	@BeforeClass(groups= {"sanity"})
	public void setup() {
		if(rb.getString("browser").equals("chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(option);	
		}else {
			EdgeOptions option = new EdgeOptions();
			option.addArguments("--remote-allow-origins=*");
			driver=new EdgeDriver(option);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(rb.getString("url1"));
	}
	@AfterSuite
	public void tearout() {
		
            //driver.quit();
        
        }
    //}
	
	 //public static WebDriver getDriver() {
	        //return driver.get(); // Return the WebDriver instance for the current thread
	  //  }
	 
	public void screenshot() throws IOException {
		File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination= new File("user.dir"+"\\Screenshots.png");
		FileUtils.copyFile(screenshot, destination);
	}

}

