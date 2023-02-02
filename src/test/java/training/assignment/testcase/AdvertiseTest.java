package training.assignment.testcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import training.assignment.base.BasePage;
import training.assignment.base.Login;
import training.assignment.pages.HomePage;
import training.assignment.pages.MoreOptionsPage;

public class AdvertiseTest extends BasePage {
	
	
	
	@Test(groups = {"all", "moreoptions"})
	public void advertiseTest() {
		WebElement mainMenu = driver.findElement(HomePage.moreOptionBtn);
		Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu).perform();
		WebElement subMenu = driver.findElement(MoreOptionsPage.advertiseBtn);
		actions.moveToElement(subMenu).perform();
		actions.click().build().perform();
	}
}
