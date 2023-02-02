package training.assignment.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import training.assignment.base.BasePage;
import training.assignment.base.Login;
import training.assignment.pages.CartPage;
import training.assignment.pages.HomePage;

public class RemoveItemTest extends BasePage {
	
	@BeforeMethod
	public void login() {
		Login.signin();
	}
	@Test(groups = {"all", "cart"})
	public void removeItem() throws InterruptedException {	
		driver.findElement(HomePage.CartBtn).click();
		driver.findElement(CartPage.RemoveBtn).click();
		Thread.sleep(2000);
		driver.findElement(CartPage.ConfirmRemove).click();
	}

}
