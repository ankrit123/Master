package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {
	WebDriver driver;

	@FindBy(xpath = "//div/h5[text() = 'Elements']")
	WebElement elements;

	@FindBy(xpath = "//div/h5[text() = 'Forms']")
	WebElement forms;

	@FindBy(xpath = "//div/h5[text() = 'Alerts, Frame & Windows']")
	WebElement AlertFramesAndWindows;

	@FindBy(xpath = "//div/h5[text() = 'Widgets']")
	WebElement widgets;

	@FindBy(xpath = "//div/h5[text() = 'Interactions']")
	WebElement interactions;

	@FindBy(xpath = "//div/h5[text() = 'Book Store Application']")
	WebElement bookStoreApp;

	/*
	 * widgets.isDisplayed(); interactions.isDisplayed();
	 * bookStoreApp.isDisplayed();
	 */

	@Test
	public void forms() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/");

		// PageFactory.initElements(driver,HomePage.class);
		// forms.click();
		//driver.findElement(By.xpath("//div/h5[text() = 'Forms']"));
		driver.findElement(By.xpath("//div/h5[text() = 'Forms']")).click();
		driver.findElement(By.xpath("//li/span[text()='Practice Form']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("DEF");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		driver.findElement(By.xpath("//div/select[@class='react-datepicker__year-select']")).click();
		driver.findElement(By.xpath("//div/select/option[@value='1995']")).click();
		driver.findElement(By.xpath("//div/select[@class='react-datepicker__month-select']")).click();
		driver.findElement(By.xpath("//div/select/option[text()='March']")).click();
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='react-datepicker__month']/div"));
		for (int i = 0; i < row.size(); i++) {
			for (int j = 0; j < 7; j++) {
				WebElement date = driver.findElement(
						By.xpath("//div[@class='react-datepicker__month']/div[" + (i + 1) + "]/div[" + (j + 1) + "]"));
				String day = date.getText();
				if (day.equals("7")) {
					date.click();
					break;
				}
			}

		}

	}

	public void alertHandling() {
		AlertFramesAndWindows.isDisplayed();

	}
}
