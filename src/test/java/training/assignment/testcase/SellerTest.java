package training.assignment.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import training.assignment.base.BasePage;
import training.assignment.base.Login;
import training.assignment.pages.HomePage;
import training.assignment.pages.SellerPage;

public class SellerTest extends BasePage {
	
	
	@Test(groups = {"all", "home"})
	public void sellerTest() throws InterruptedException {
		driver.findElement(HomePage.becomeAsellerBtn).click();
	}

}
