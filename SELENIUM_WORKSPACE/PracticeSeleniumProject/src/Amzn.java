import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CommonFunctions cmn=new CommonFunctions();
		
		
		SingleToneBrowser sbc3= SingleToneBrowser.getInstanceOfSingletonBrowserClass();
		WebDriver driver=sbc3.getDriver();
		//WebDriver driver
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		cmn.implicitWaitTime(10);
		driver.get("https://www.amazon.in");
		//driver.findElement(By.xpath("//span[contains(text(),\"Account & Lists\")]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),\"Best Sellers\")]")).click();
		cmn.explicitWaitTimeClick( driver,By.xpath("//a[contains(text(),\"Best Sellers\")]"), 10);
		
		List <WebElement> mnu=driver.findElements(By.xpath("//*[@id=\"zg_browseRoot\"]/ul"));
		
		for(WebElement wl: mnu) {
			System.out.println(wl.getText());
			System.out.println("*********************************************************************");
			if(wl.getText().contains("Electronics")) {
				cmn.explicitWaitTimeClick( driver,By.xpath("//a[contains(text(),\"Electronics\")]"), 10);
				System.out.println("Clicked!!");
			}
			else {
				System.out.println("Thanks");
				//driver.findElement(By.xpath("//a[contains(text(),\"Electronics\")]")).click();
			}
		}
		
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
		
		try {
List <WebElement> mnuLft=driver.findElements(By.xpath("//*[@id=\"hmenu-content\"]/ul[18]"));
		
		for(WebElement wllft: mnuLft) {
			System.out.println(wllft.getText());
			System.out.println("*********************************************************************");
			if(wllft.getText().contains("Flight Tickets")) {
				cmn.explicitWaitTimeClick( driver,By.xpath("//*[@id=\"hmenu-content\"]/ul[18]/li[5]/a/div/text()"), 40);
				System.out.println("Clicked Manin Menu!!");
			}
			else {
				System.out.println("Thanks Mate");
				//driver.findElement(By.xpath("//a[contains(text(),\"Electronics\")]")).click();
			}
		}
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	driver.quit();

	}

}
