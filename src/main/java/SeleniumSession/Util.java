package SeleniumSession;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ISelect;
/**
 
 *The method is used to handle alert
 *@param driver
 * @author brttuba
 *
 */
public class Util {//common(ortak) method
	public static final int DEFAULT_EXP_WAIT = 0;
	public static  String getAlertText(WebDriver driver){ //prof generic usege
		Alert alert=driver.switchTo().alert();
		String text= alert.getText();
		System.out.println(text);
		alert.accept();
		return text;
	}
	/** 
	 * to get title of the page
	 * @param driver
	 * @return
	 */
	public static String getPageTitle(WebDriver driver){
		return driver.getTitle();
	}
	public static void launchURL(WebDriver driver,String url){
		driver.get(url);
		
	}
	/**
	 * This is Launch browser
	 * @param driver
	 * @param browserName
	 * @return
	 */
	public static WebDriver launchBrowser(WebDriver driver,String browserName){
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
			driver=new ChromeDriver();
			
		}
		else if (browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","/Users/brttuba/Desktop/geckodriver");
			driver= new FirefoxDriver();
			
			
		}
		else{
			System.out.println("Browser is not correct"+browserName);
			
		}
		return driver;
		
	}
	/**
	 * click on Element
	 * 
	 * @param driver
	 * @param locator
	 */
	public static void clickOn(WebDriver driver,By locator){
		driver.findElement(locator).click();
	}
	public static void closeBrowser(WebDriver driver){
		driver.quit();
	}
	/**
	 * get element HTML
	 * @param driver
	 * @param locator
	 * @return
	 */
	public  static WebElement getElement(WebDriver driver,By locator){
		WebElement element=driver.findElement(locator);
		return element;
	}
}
