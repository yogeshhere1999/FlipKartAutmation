package training.assignment.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import training.assignment.base.BasePage;
import training.assignment.pages.CartPage;

public class TopDealsTest extends BasePage {
	
	@BeforeMethod
	public void openProductUrl() {
		driver.get(CartPage.ProductUrl);
	}
	
	@Test(groups = {"all", "cart"})
	public void cartTest() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		WebElement ele = driver.findElement(By.className("_36yFo0"));
		ele.sendKeys("110055", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(CartPage.AddToCartBtn).click();
	}
}
