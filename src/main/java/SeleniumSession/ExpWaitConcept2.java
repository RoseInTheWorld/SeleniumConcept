package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpWaitConcept2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		//launch browser-start browser
				WebDriver driver=new ChromeDriver();
				//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				driver.get("https://app.hubspot.com/login");
				WebDriverWait wait=new WebDriverWait(driver, 15);
				wait.until(ExpectedConditions.titleContains("HubSpot Login"));
				System.out.println("Title is:"+driver.getTitle());
				By email=By.id("username");
				
				//wait.until(ExpectedConditions.presenceOfElementLocated(email));
				//driver.findElement(email).sendKeys("ilhan@gmail.com");
							By password=By.id("password");
							By loginButton=By.id("loginBtn");
							By header=By.className("private-page__title");
							
	}
				public static WebElement getElement(WebDriver driver,By locator,int timeout){
					waitForPresenceOfElement(driver,locator,timeout);
					WebElement element=driver.findElement(locator);
					return element;
				}
				public static void waitForPresenceOfElement(WebDriver driver,By locator,int timeout){
					WebDriverWait wait=new WebDriverWait(driver, 15);
					wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				}

	

}
