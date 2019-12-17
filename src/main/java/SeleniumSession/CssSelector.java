package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
			System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
					
					WebDriver driver=new ChromeDriver();

					driver.get("https://app.hubspot.com/login");
			  Thread.sleep(5000);
			  //first
			 // WebElement userElement=driver.findElement(By.cssSelector("#username");
			 // userElement.sendKeys("ilhanturkmen@hotmail.com");
			  
	
	//second
	driver.findElement(By.cssSelector("#username")).sendKeys("ilhan@hotmail.com");
	//third
	By username=By.cssSelector("#username");
	WebElement userElement=driver.findElement(username);
	userElement.sendKeys("ilhan@hotmail.com");
	
	
	
	
	//fourth
	//Util.getElement(driver, "#username").sendKeys("ilhanturkmen@hotmail.com);
	//css selector:only moves forword does not move backword
	//it is faster than xpath
	
	
	
	
	}
	
}
