package training.assignment.testcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import training.assignment.base.BasePage;
import training.assignment.base.Login;
import training.assignment.pages.HomePage;
import training.assignment.pages.MoreOptionsPage;
import training.assignment.pages.NotificationPreferencePage;

public class NotificationPreferenceTest extends BasePage {
	
	
	@Test(groups = {"all", "moreoptions"})
	public void notificationPreferenceTest() {
		WebElement mainMenu = driver.findElement(HomePage.moreOptionBtn);
		Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu).perform();
		WebElement subMenu = driver.findElement(MoreOptionsPage.notificationPreferencesBtn);
		actions.moveToElement(subMenu).perform();
		actions.click().build().perform();
		String name = driver.findElement(NotificationPreferencePage.allDesktopNotificationText).getText();
		Assert.assertEquals("Desktop Notifications", name);

	}
}
