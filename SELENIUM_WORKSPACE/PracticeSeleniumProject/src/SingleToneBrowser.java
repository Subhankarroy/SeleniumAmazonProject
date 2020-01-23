import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleToneBrowser {

	// instance of singleton class
	private static SingleToneBrowser instanceOfSingletonBrowserClass=null;
	
	
    private WebDriver driver;

    // Constructor
    private SingleToneBrowser(){
    	System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
    }

    // TO create instance of class
    public static SingleToneBrowser getInstanceOfSingletonBrowserClass(){
        if(instanceOfSingletonBrowserClass==null){
        	instanceOfSingletonBrowserClass = new SingleToneBrowser();
        }
        return instanceOfSingletonBrowserClass;
    }
    
    // To get driver
    public WebDriver getDriver()
    {
    	return driver;
    }
    

   
}