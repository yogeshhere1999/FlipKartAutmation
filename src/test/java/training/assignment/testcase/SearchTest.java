package training.assignment.testcase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import training.assignment.base.BasePage;
import training.assignment.base.Login;
import training.assignment.pages.HomePage;

public class SearchTest extends BasePage {
	
	@Test(groups = {"all", "home"})
	public void searchTest() {
		driver.findElement(HomePage.search_txtbar).sendKeys("Digital Watch");
		driver.findElement(HomePage.search_btn).submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
}
