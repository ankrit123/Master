import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport {
	
	ExtentReports reports;
	@BeforeTest
	public void config()

	{
		String Path=System.getProperty("user.dir")+"\\report\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(Path);
		reporter.config().setReportName("web automation report");
		reporter.config().setDocumentTitle("Test Results");
		
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Tester", "Ankrit tiwari");
	}
	
	
	
	
	
	@Test
	
	public void InitialDemo()
	{
		reports.createTest("Initial Demo");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		reports.flush();
	
		
	}

}
