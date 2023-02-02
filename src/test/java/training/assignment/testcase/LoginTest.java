package training.assignment.testcase;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import training.assignment.base.BasePage;
import training.assignment.pages.LoginPage;
import training.assignment.utilities.*;

public class LoginTest extends BasePage {
	
	@Test(groups = {"all", "login"})
	public void correctemailtest() throws InterruptedException {
		driver.findElement(LoginPage.txt_mobile).sendKeys(ReadingPropertiesFile.prop.getProperty("mobile"));
		driver.findElement(LoginPage.txt_password).sendKeys(ReadingPropertiesFile.prop.getProperty("password"));
		driver.findElement(LoginPage.btn_login).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}