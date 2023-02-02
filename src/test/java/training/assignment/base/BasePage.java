package training.assignment.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import training.assignment.pages.LoginPage;
import training.assignment.utilities.ExtentManager;
import training.assignment.utilities.ReadingPropertiesFile;
import training.assignment.utilities.ScreenShots;

public class BasePage {
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;

	@SuppressWarnings("deprecation")
	@BeforeSuite
	@Parameters("browser")
	public void initializeWebdriver(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty(ReadingPropertiesFile.prop.getProperty("firefoxProperty"),
					ReadingPropertiesFile.prop.getProperty("firefoxDriver"));
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("firefoxHeadless")) {
			System.setProperty(ReadingPropertiesFile.prop.getProperty("firefoxProperty"),
					ReadingPropertiesFile.prop.getProperty("firefoxDriver"));
			FirefoxOptions options = new FirefoxOptions();
			options.setHeadless(true);
			driver = new FirefoxDriver(options);
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(ReadingPropertiesFile.prop.getProperty("chromeProperty"),
					ReadingPropertiesFile.prop.getProperty("chromeDriver"));
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("chromeHeadless")) {
			System.setProperty(ReadingPropertiesFile.prop.getProperty("chromeProperty"),
					ReadingPropertiesFile.prop.getProperty("chromeDriver"));
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			driver = new ChromeDriver(options);
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty(ReadingPropertiesFile.prop.getProperty("ieProperty"),
					ReadingPropertiesFile.prop.getProperty("ieDriver"));
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability("ignoreZoomSetting", true);
			driver = new InternetExplorerDriver(caps);
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		extent = ExtentManager.getInstance("reports\\ExtentReports.html");
	}

	@BeforeMethod
	public void enterurl(Method method) {
		driver.get(ReadingPropertiesFile.prop.getProperty("Url"));
		test = extent.startTest(method.getName());
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS)
			test.log(LogStatus.PASS, "Test case got passed");
		else if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getThrowable());
			String screenshotPath = ScreenShots.takeScreenShot(driver, result.getName());
			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
		} else if (result.getStatus() == ITestResult.SKIP)
			test.log(LogStatus.SKIP, result.getThrowable());
		extent.endTest(test);
		extent.flush();
	}

	@AfterSuite
	public void browserclose() {
		driver.quit();
	}
}