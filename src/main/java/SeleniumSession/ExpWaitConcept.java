package SeleniumSession;

import java.util.concurrent.TimeUnit;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpWaitConcept {

	public static void main(String[] args) {
		/*
		 * Explicit and Implicit Waits
Waiting is having the automated task execution elapse a certain amount of time before continuing with the next step. You should choose to use Explicit Waits or Implicit Waits.

An explicit wait is code you define to wait for a certain condition to occur before proceeding further in the code.
		 */
		
		System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		//launch browser-start browser
				WebDriver driver=new ChromeDriver();
				//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				driver.get("https://app.hubspot.com/login");
				//thread.sleep(5000);
				//Explicitly wait:works with webelement an non web element
				//it is available web driver wait class
				//explicitly wait will be applied non webelement and web element
				
				//exp wait for non web element
				WebDriverWait wait=new WebDriverWait(driver, 15);//if you dont save enough time TimeOutException
				wait.until(ExpectedConditions.titleContains("HubSpot Login"));
				System.out.println("Title:"+driver.getTitle());
				
				//for web element
				//no such element exception
				//driver.findElement(By.id("username")).sendKeys("ilhan@gmail.com");
				//WebElement email=driver.findElement(By.id("username"));
				//wait.until(ExpectedConditions.visibilityOf(email));
				By email=By.id("username");
	
	//wait.until(ExpectedConditions.presenceOfElementLocated(email));
	//driver.findElement(email).sendKeys("ilhan@gmail.com");
				By password=By.id("password");
				By loginButton=By.id("loginBtn");
				By header=By.className("private-page__title");
				
	getElement(driver,email,10).sendKeys("ilhan@gmail.com");
	getElement(driver,password,5 ).sendKeys("123Test");
	getElement(driver, loginButton, 2).click();
	
	//getElement(driver,loginButton).click();
	String text=getElement(driver, header, Util.DEFAULT_EXP_WAIT).getText();
	System.out.println(text);
	if(text.equals("Marketing Dashboard")){
		System.out.println("title is correct");
		
		
	}else{
		System.out.println("Title is incorrect");
	}
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
