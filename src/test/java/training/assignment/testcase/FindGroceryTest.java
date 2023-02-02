package training.assignment.testcase;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import training.assignment.base.BasePage;
import training.assignment.base.Login;
import training.assignment.pages.GroceryPage;
import training.assignment.pages.HomePage;
import training.assignment.utilities.ReadingPropertiesFile;

public class FindGroceryTest extends BasePage {
	
	@BeforeMethod
	public void login() {
		Login.signin();
	}
	@Test(groups = {"all", "home"})
	public void groceryTest() throws InterruptedException {
	    driver.findElement(HomePage.flipkarticon).click();
		driver.findElement(HomePage.groceryBtn).click();
		driver.findElement(GroceryPage.deliveryBtn).click();
		driver.findElement(GroceryPage.pincodeTextBox).sendKeys(ReadingPropertiesFile.prop.getProperty("pincode"), Keys.ENTER);
		String name = driver.findElement(GroceryPage.delpincode).getText();
		Assert.assertEquals(name, "Delivery to 110055");
	}
}
