package training.assignment.testcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import training.assignment.base.BasePage;
import training.assignment.base.Login;
import training.assignment.pages.HomePage;
import training.assignment.pages.MenuPage;
import training.assignment.pages.NotificationPage;

public class NotificationTest extends BasePage {
	
	@Test(groups = {"all", "menu"})
	public void superCoinTest() {
		WebElement mainMenu = driver.findElement(HomePage.MenuBtn);
		Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu).perform();
		WebElement subMenu = driver.findElement(MenuPage.notificationBtn);
		actions.moveToElement(subMenu).perform();
		actions.click().build().perform();
		String name = driver.findElement(NotificationPage.AllNotificationText).getText();
		Assert.assertEquals("All Notifications", name);
	}
}
