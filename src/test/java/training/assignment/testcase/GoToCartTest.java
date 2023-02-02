package training.assignment.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import training.assignment.base.BasePage;
import training.assignment.base.Login;
import training.assignment.pages.HomePage;

public class GoToCartTest extends BasePage {
	
	@BeforeMethod
	public void login() {
		Login.signin();
	}
	@Test(groups = {"all", "cart"})
	public void CartButton() {
		driver.findElement(HomePage.CartBtn).click();
	}
}
