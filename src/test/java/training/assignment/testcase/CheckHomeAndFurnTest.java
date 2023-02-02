package training.assignment.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import training.assignment.base.BasePage;
import training.assignment.base.Login;
import training.assignment.pages.HomeAndFurniture;
import training.assignment.pages.HomePage;

public class CheckHomeAndFurnTest extends BasePage{
	
	@BeforeMethod
	public void login() {
		Login.signin();
	}
	@Test(groups = {"all", "home"})
	public void homeAndfurnTest() throws InterruptedException{
		
		driver.findElement(HomePage.homeAndfurBtn).click();
		Thread.sleep(2000);
		driver.findElement(HomeAndFurniture.viewAllBtn).click();
	}

}
