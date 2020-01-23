import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {
	
	SingleToneBrowser sbc2= SingleToneBrowser.getInstanceOfSingletonBrowserClass();
	WebDriver driver=sbc2.getDriver();
	
	//Quit All Browsers
	public void closeAllBrowsers() {
		driver.quit();
		
	}
	
	//Close a single instance of a driver
	public void closeSingleBrowser() {
		driver.close();
		
	}
	
	public void implicitWaitTime(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public void explicitWaitTimeClick(WebDriver driver,By element, int time ) {
		
		WebDriverWait wait=new WebDriverWait(driver,time);
		WebElement webelement=wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		webelement.click();
	}
	
	public void refreshPage() {
		System.out.println("Thanks mate!");
	}
	
	public void navigateProject() {
		System.out.println("Navigate Pages!");
	}

}
