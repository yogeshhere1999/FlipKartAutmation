package training.assignment.base;

import java.util.concurrent.TimeUnit;

import training.assignment.pages.LoginPage;
import training.assignment.utilities.ReadingPropertiesFile;

public class Login extends BasePage {
	
	public static void signin() {
		driver.get(ReadingPropertiesFile.prop.getProperty("Url"));
		//driver.findElement(LoginPage.txt_mobile).sendKeys(ReadingPropertiesFile.prop.getProperty("mobile"));
		//driver.findElement(LoginPage.txt_password).sendKeys(ReadingPropertiesFile.prop.getProperty("password"));
		//driver.findElement(LoginPage.btn_login).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
