package training.assignment.pages;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import training.assignment.base.BasePage;

public class LoginPage extends BasePage {

	public static By txt_mobile = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	public static By txt_password = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	public static By btn_login = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span");

}
